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
	
	@GetMapping("monumentById")
	public Monument getMonumentById(String id) {
		return monumentService.getMonumnetById(id);
	}
	
	@GetMapping("monumentListOfCelebrite")
	public Set<Monument> getMonumentListByCelebriteId(@RequestParam int id) {
		return monumentService.getMonumentListByCelebriteId(id);
	}
	
	@GetMapping("calculeDistance")
	public static float distFrom(float lat1, float lng1, float lat2, float lng2) {
	    double earthRadius = 6371000; //meters
	    double dLat = Math.toRadians(lat2-lat1);
	    double dLng = Math.toRadians(lng2-lng1);
	    double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
	               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
	               Math.sin(dLng/2) * Math.sin(dLng/2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	    float dist = (float) (earthRadius * c);

	    return dist; //meters
	 }

}
