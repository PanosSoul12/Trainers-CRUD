
package com.myprj.mvcapp.domain.repository.impl;

import com.myprj.mvcapp.domain.Trainer;
import com.myprj.mvcapp.domain.repos.TrainerRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class MySqlTrainerRepository implements
        TrainerRepository{
    
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    
    
    @Override
    public List<Trainer> getAllTrainers(){
        
        List<Trainer> result = 
                jdbcTemplate.query("SELECT * FROM trainers", new TrainerMapper());
        return result;
    
    }
    
    @Autowired
    private JdbcTemplate jdbcTemplateADD;
    public void addTrainer(Trainer trainer){
        
        jdbcTemplateADD.update("INSERT INTO trainers VALUES(?,?,?,?,?)"
        ,new Object[]{
           trainer.getId(),
           trainer.getfName(),
           trainer.getlName(),
           trainer.getEmail(),
           trainer.getSubject()
        });
                
    }
    
    public void deleteTrainer(String id){
        
        jdbcTemplateADD.update("DELETE FROM trainers WHERE T_ID=?",
                new Object[]{ id });
                
    
    }
    public Trainer getTrainer(String id){
            
        Trainer trainer;
        trainer = jdbcTemplateADD.queryForObject("SELECT * FROM trainers WHERE T_ID = ?"
                ,new Object[] { id },
                new TrainerMapper());
        
        return trainer;
    }
    @Override
    public void updateTrainer(Trainer trainer){
        
        jdbcTemplateADD.update("UPDATE trainers SET T_FNAME=?,T_LNAME=?,T_EMAIL=?,T_SUBJECT=? WHERE T_ID=?"
        ,new Object[]{
        trainer.getfName(),
        trainer.getlName(),
        trainer.getEmail(),
        trainer.getSubject(),
        trainer.getId()});
    }
    
    private static final class TrainerMapper implements RowMapper<Trainer>{
        
        @Override
        public Trainer mapRow(ResultSet rs ,int rowNum)throws SQLException{
            Trainer trainer = new Trainer();
            trainer.setId(rs.getString("T_ID"));
            trainer.setfName(rs.getString("T_FNAME"));
            trainer.setlName(rs.getString("T_LNAME"));
            trainer.setEmail(rs.getString("T_EMAIL"));
            trainer.setSubject(rs.getString("T_SUBJECT"));
            
            return trainer;
        }
    }
    
}
