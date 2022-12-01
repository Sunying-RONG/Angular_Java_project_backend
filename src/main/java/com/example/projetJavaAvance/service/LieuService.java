package com.example.projetJavaAvance.service;

import java.util.List;

import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.model.Monument;

public abstract interface LieuService {
	List<Lieu> fetchLieuList();
	List<Monument> getMonumentListByLieuId(String lieu_id);
}
