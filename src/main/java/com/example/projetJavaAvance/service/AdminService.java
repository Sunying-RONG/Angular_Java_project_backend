package com.example.projetJavaAvance.service;

import java.util.List;

import com.example.projetJavaAvance.model.Admin;

public abstract interface AdminService {
	List<Admin> fetchAdminList();
	boolean adminLogin(String username, String password);
}
