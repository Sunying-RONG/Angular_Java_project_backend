package com.example.projetJavaAvance.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetJavaAvance.model.Celebrite;
import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.service.CelebriteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/")
//Angular frontend to http://localhost:4200, and our Boot backend to http://localhost:8080
public class CelebriteController {
	
	@Autowired
	private CelebriteService celebriteService;
	
	@GetMapping("celebrites")
	public List<Celebrite> fetchMonumentList() {
		return celebriteService.fetchCelebriteList();
	}
	
	@GetMapping("celebriteListOfMonument")
	public Set<Celebrite> getCelebriteListByMonumentId(@RequestParam String id) {
		return celebriteService.getCelebriteListByMomumentId(id);
	}
	
	@GetMapping("celebriteById")
	public Celebrite getCelebriteListById(@RequestParam int celebrite_id) {
		return celebriteService.getCelebriteById(celebrite_id);
	}
	
	@PostMapping("createCelebrite")
	public Celebrite createCelebrite(@RequestBody Celebrite celebrite) {
		System.out.println(celebrite);
		return celebriteService.createCelebrite(celebrite);
	}
	
	@DeleteMapping("deleteCelebriteById/{celebrite_id}")
	public void deleteCelebrite(@PathVariable int celebrite_id) {
		System.out.println(celebrite_id);
		celebriteService.deleteCelebrite(celebrite_id);
	}

}
