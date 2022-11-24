package com.example.projetJavaAvance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.service.DepartementService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//Angular frontend to http://localhost:4200, and our Boot backend to http://localhost:8080
public class DepartementController {
	
	@Autowired
	private DepartementService departementService;
	
	// Read operation
	@GetMapping("/lieuOfDepartement")
	public List<Lieu> getLieuListByDepartementId(@RequestParam String id) {
		System.out.println("departement id : "+id);
		return departementService.getLieuListByDepartementId(id);
	}

}
