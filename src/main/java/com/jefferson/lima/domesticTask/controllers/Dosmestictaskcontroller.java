package com.jefferson.lima.domesticTask.controllers;

import com.jefferson.lima.domesticTask.dtos.Domestictaskdto;
import com.jefferson.lima.domesticTask.services.Domesticktaskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
