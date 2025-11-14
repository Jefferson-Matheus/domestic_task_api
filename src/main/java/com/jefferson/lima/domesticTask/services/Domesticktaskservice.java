package com.jefferson.lima.domesticTask.services;


import com.jefferson.lima.domesticTask.dtos.Domestictaskdto;
import com.jefferson.lima.domesticTask.entities.DomesticTask;
import com.jefferson.lima.domesticTask.repositories.Taskrepository;
import com.jefferson.lima.domesticTask.statusEnum.StatusDomesticTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Domesticktaskservice {
    @Autowired
    private Taskrepository taskrepository;

    @Transactional(readOnly = true)
    public List<Domestictaskdto> findAll(){
        List<DomesticTask> domesticTasksResult = taskrepository.findAll();

        List<Domestictaskdto> domesticTasksInformations = domesticTasksResult.stream().map(x -> new Domestictaskdto(x)).toList();

        return domesticTasksInformations;
    }

    public void updateToFinishedSatus(long idTask){
        DomesticTask taskSelected = taskrepository.findById(idTask).orElseThrow(() -> new RuntimeException("T"));

        taskSelected.setStatus(StatusDomesticTask.FINISHED);

        taskrepository.save(taskSelected);
    }
    
    
    public void upadateDomesticTaskName(long idTask, String taskName) {
    	DomesticTask taskSelected = taskrepository.findById(idTask).orElseThrow(() -> new RuntimeException("T"));
    	
    	taskSelected.setName(taskName);
    	
    	taskrepository.save(taskSelected);
    }
}
