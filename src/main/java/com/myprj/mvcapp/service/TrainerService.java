/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.mvcapp.service;

import com.myprj.mvcapp.domain.Trainer;
import java.util.List;

/**
 *
 * @author USER
 */
public interface TrainerService {
    
    List<Trainer> getAllTrainers();
    void addTrainer(Trainer trainer);
    void deleteTrainer(String id);
    Trainer getTrainer(String id);
    void updateTrainer(Trainer trainer);
    
}
