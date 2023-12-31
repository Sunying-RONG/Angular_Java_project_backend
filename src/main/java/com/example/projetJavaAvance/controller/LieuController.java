package com.example.projetJavaAvance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.service.LieuService;

@RestController
@CrossOrigin
@RequestMapping("api/")
//Angular frontend to http://localhost:4200, and our Boot backend to http://localhost:8080
public class LieuController {
	
	@Autowired
	private LieuService lieuService;
	
	@GetMapping("lieux")
	public List<Lieu> fetchLieuList() {
		return lieuService.fetchLieuList();
	}
	
	@GetMapping("monumentsOfLieu") // http://localhost:8080/monumentsOfLieu?id=34199
	public List<Monument> getMonumentListByLieuId(@RequestParam String id) {
		return lieuService.getMonumentListByLieuId(id);
	}
	
	@GetMapping("lieuById")
	public Lieu getLieuById(@RequestParam String lieu_id) {
		return lieuService.getLieuById(lieu_id);
	}

}
