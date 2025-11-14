package com.jefferson.lima.domesticTask.controllers;

import com.jefferson.lima.domesticTask.dtos.Domestictaskdto;
import com.jefferson.lima.domesticTask.services.Domesticktaskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/domesticktasks")
public class Dosmestictaskcontroller {

    @Autowired
    private Domesticktaskservice domestickTaskService;

    @GetMapping
    public List<Domestictaskdto> findAll(){
        List<Domestictaskdto> domesticTaskResult = domestickTaskService.findAll();

        return domesticTaskResult;
    }

    @PutMapping("/{id}/finished")
    public void updateToFinished(@PathVariable Long id){

       domestickTaskService.updateToFinishedSatus(id);

    }
    
    @PutMapping("/{id}/upadateName")
    public void upadateName(@PathVariable Long id, @RequestBody Domestictaskdto body) {
    	
    	String bodyTaskname = body.getName();
    	
    	domestickTaskService.upadateDomesticTaskName(id, bodyTaskname);
    	
    }

}
