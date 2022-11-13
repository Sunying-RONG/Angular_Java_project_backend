package com.example.projetJavaAvance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.repository.MonumentRepository;
import com.example.projetJavaAvance.service.MonumentService;
import com.example.projetJavaAvance.service.MonumentServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//Angular frontend to http://localhost:4200, and our Boot backend to http://localhost:8080
public class MonumentController {
	
	@Autowired
	private MonumentService monumentService;
	
	// Read operation
	@GetMapping("/monuments")
	public List<Monument> fetchMonumentList() {
		System.out.println("***in controller***");
		return monumentService.fetchMonumentList();
	}

}
