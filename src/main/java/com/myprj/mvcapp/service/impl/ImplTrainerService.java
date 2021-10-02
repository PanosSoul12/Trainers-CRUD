
package com.myprj.mvcapp.service.impl;

import com.myprj.mvcapp.domain.Trainer;
import com.myprj.mvcapp.domain.repos.TrainerRepository;
import com.myprj.mvcapp.service.TrainerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImplTrainerService
             implements TrainerService{
    
    @Autowired
    TrainerRepository trainerRepository;
    
    
    @Override
     public List<Trainer> getAllTrainers(){
        return trainerRepository.getAllTrainers();
    }

    @Override
    public void addTrainer(Trainer trainer) {
            
        trainerRepository.addTrainer(trainer);
    }

    @Override
    public void deleteTrainer(String id) {
        trainerRepository.deleteTrainer(id);
    }
    

    @Override
    public Trainer getTrainer(String id) {
        
        return trainerRepository.getTrainer(id);

    }

    @Override
    public void updateTrainer(Trainer trainer) {

        trainerRepository.updateTrainer(trainer);

    }
    
}
