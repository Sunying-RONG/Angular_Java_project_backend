package com.example.projetJavaAvance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetJavaAvance.model.Admin;
import com.example.projetJavaAvance.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("api/")
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	@GetMapping("admins")
	public List<Admin> fetchAdminList() {
		return this.adminservice.fetchAdminList();
	}
	
	@PostMapping("adminLogin")
	public boolean adminLogin(@RequestBody Admin admin) {
		return this.adminservice.adminLogin(admin.getUsername(), admin.getPassword());
	}

}
