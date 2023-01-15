package com.example.projetJavaAvance.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.service.MonumentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/")
//Angular frontend to http://localhost:4200, and our Boot backend to http://localhost:8080
public class MonumentController {
	
	@Autowired
	private MonumentService monumentService;
	
	@GetMapping("monuments")
	public List<Monument> fetchMonumentList() {
		return monumentService.fetchMonumentList();
	}
	
	@GetMapping("monumentListOfCelebrite")
	public Set<Monument> getMonumentListByCelebriteId(@RequestParam int id) {
		return monumentService.getMonumentListByCelebriteId(id);
	}

}
