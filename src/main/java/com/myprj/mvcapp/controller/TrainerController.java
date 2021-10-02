
package com.myprj.mvcapp.controller;

import com.myprj.mvcapp.domain.Trainer;
import com.myprj.mvcapp.service.TrainerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TrainerController {
    
    @Autowired
    private TrainerService trainerService;
    
    @RequestMapping("/trainers")
    public String listTrainers(Model model){
        
        List<Trainer> trainer =
                trainerService.getAllTrainers();
        
        model.addAttribute("view_trainer" ,trainer);
        
        return "trainers";
        
        
    }
    @RequestMapping("/trainer_add")
    public String addPage(Model model){
    
        return "trainer_add";
    }
    
    @RequestMapping(
            value="/trainer/add",
            method = RequestMethod.POST)
    public String addTrainer(
            @RequestParam(value ="id") String trainerId,
            @RequestParam(value ="fName") String firstName,
            @RequestParam(value ="lName") String lastName,
            @RequestParam(value ="email") String email,
            @RequestParam(value ="subject") String subject,
            Model model
    ){
        Trainer trainer = new Trainer();
        trainer.setId(trainerId);
        trainer.setfName(firstName);
        trainer.setlName(lastName);
        trainer.setEmail(email);
        trainer.setSubject(subject);
        
        trainerService.addTrainer(trainer);
        
        List<Trainer> trainerL =
                trainerService.getAllTrainers();
        
        model.addAttribute("view_trainer",trainerL);
        
        return "trainers";
    }
    
    @RequestMapping(value = "/trainer/delete/{id}",
            method = RequestMethod.GET)
    public String deleteTrainer(
            @PathVariable String id,
            Model model
    ){
        
        trainerService.deleteTrainer(id);
        
        List<Trainer> trainerL=
                trainerService.getAllTrainers();
        
        model.addAttribute("view_trainer",trainerL);
        
        return "trainers";
    
    }
    @RequestMapping(value="/trainer/update/{id}",
            method = RequestMethod.GET)
    public String updatePage(
    @PathVariable("id")String id,
            Model model){
        model.addAttribute("id",id);
        Trainer trainer;
        trainer=trainerService.getTrainer(id);
        model.addAttribute("view_trainer",trainer);
        
        return "trainer_update";
    }
    @RequestMapping(value="/trainer/update",
            method = RequestMethod.POST)
    public String updateTrainer(
            @RequestParam(value ="id") String trainerId,
            @RequestParam(value ="fName") String firstName,
            @RequestParam(value ="lName") String lastName,
            @RequestParam(value ="email") String email,
            @RequestParam(value ="subject") String subject,
            Model model
    ){
        Trainer trainer = new Trainer();
        trainer.setId(trainerId);
        trainer.setfName(firstName);
        trainer.setlName(lastName);
        trainer.setEmail(email);
        trainer.setSubject(subject);
        
        trainerService.updateTrainer(trainer);
        
        List<Trainer> trainersL = trainerService.getAllTrainers();
        
        model.addAttribute("view_trainer",trainersL);
        
        return "trainers";
    
    }
}
