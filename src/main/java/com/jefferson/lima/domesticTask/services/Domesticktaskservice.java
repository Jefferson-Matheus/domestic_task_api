package com.jefferson.lima.domesticTask.services;


import com.jefferson.lima.domesticTask.dtos.Domestictaskdto;
import com.jefferson.lima.domesticTask.entities.DomesticTask;
import com.jefferson.lima.domesticTask.repositories.Taskrepository;
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
}
