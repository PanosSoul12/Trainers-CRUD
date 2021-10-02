
package com.myprj.mvcapp.domain.repos;

import com.myprj.mvcapp.domain.Trainer;
import java.util.List;


public interface TrainerRepository {
    
    List<Trainer> getAllTrainers();
    void addTrainer(Trainer trainer);
    void deleteTrainer(String id);
    Trainer getTrainer(String id);
    void updateTrainer(Trainer trainer);
    
}
