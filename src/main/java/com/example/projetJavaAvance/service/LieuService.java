package com.example.projetJavaAvance.service;

import java.util.List;

import com.example.projetJavaAvance.model.Monument;

public abstract interface LieuService {
	// read operation
	List<Monument> getMonumentListByLieuId(String lieu_id);
}
