package com.example.projetJavaAvance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.service.MonumentRepo;

@Controller
public class MonumentController {
	@Autowired
	private MonumentRepo monumentService;
	
	@GetMapping("/monuments")
	public String listAll(Model model) {
		List<Monument> listMonuments = monumentService.findAll();
		model.addAttribute("listMonuments", listMonuments);
		return "listMonuments";
	}

}
