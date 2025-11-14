package com.jefferson.lima.domesticTask.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jefferson.lima.domesticTask.dtos.Responsibledto;
import com.jefferson.lima.domesticTask.entities.Responsible;
import com.jefferson.lima.domesticTask.repositories.Responsiblerepository;

@Service
public class Responsibleservice {
	
	@Autowired
	private Responsiblerepository responsibleRepository;
	
	@Transactional(readOnly = true)
	public List<Responsibledto> listAllResponsibles(){
		
		List<Responsible> allResponsiblesResponse = responsibleRepository.findAll();
		
		List<Responsibledto> allResponsibles = allResponsiblesResponse.stream().map(x -> new Responsibledto(x)).toList();
		
		return allResponsibles;
	}
	
}
