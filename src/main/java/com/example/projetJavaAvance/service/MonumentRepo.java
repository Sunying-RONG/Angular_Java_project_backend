package com.example.projetJavaAvance.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.projetJavaAvance.model.Monument;

//@Service
public interface MonumentRepo extends JpaRepository<Monument, String> {
	public List<Monument> findAll();
}
