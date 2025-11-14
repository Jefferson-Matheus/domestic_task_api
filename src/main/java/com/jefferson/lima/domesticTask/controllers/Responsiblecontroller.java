package com.jefferson.lima.domesticTask.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jefferson.lima.domesticTask.dtos.Responsibledto;
import com.jefferson.lima.domesticTask.services.Responsibleservice;

@RestController
@RequestMapping(value = "/responsibles")
public class Responsiblecontroller {
	
	@Autowired
	private Responsibleservice responsibleService;
	
	@GetMapping
	public List<Responsibledto> getAllResponsibles(){
		
		List<Responsibledto> allResponsibles = responsibleService.listAllResponsibles();
		
		return allResponsibles;
	}
}
