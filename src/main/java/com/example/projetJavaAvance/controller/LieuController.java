package com.example.projetJavaAvance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.service.LieuService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//Angular frontend to http://localhost:4200, and our Boot backend to http://localhost:8080
public class LieuController {
	
	@Autowired
	private LieuService lieuService;
	
	// Read operation
	@GetMapping("/monumentsOfLieu") // http://localhost:8080/monumentsOfLieu?id=34199
	public List<Monument> getMonumentListByLieuId(@RequestParam String id) {
		System.out.println("lieu id : "+id);
		return lieuService.getMonumentListByLieuId(id);
	}

}
