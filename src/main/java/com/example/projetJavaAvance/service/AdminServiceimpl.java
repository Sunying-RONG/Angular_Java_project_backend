package com.example.projetJavaAvance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetJavaAvance.model.Admin;
import com.example.projetJavaAvance.repository.AdminRepository;

@Service
public class AdminServiceimpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	public AdminServiceimpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public List<Admin> fetchAdminList() {
		return adminRepository.findAll();
	}

	@Override
	public boolean adminLogin(String username, String password) {
		List<Admin> adminList = fetchAdminList();
		for (Admin admin : adminList) {
			if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
