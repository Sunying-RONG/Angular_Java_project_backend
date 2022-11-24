package com.example.projetJavaAvance.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.service.CelebriteService;
import com.example.projetJavaAvance.service.DepartementService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//Angular frontend to http://localhost:4200, and our Boot backend to http://localhost:8080
public class CelebriteController {
	
	@Autowired
	private CelebriteService celebriteService;
	
	@GetMapping("/monumentOfCelebrite")
	public Set<Monument> getMonumentListByCelebriteId(@RequestParam int id) {
		System.out.println("celebrite id : "+id);
		return celebriteService.getMonumentListByCelebriteId(id);
	}

}
