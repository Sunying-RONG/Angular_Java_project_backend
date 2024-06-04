package com.example.projetJavaAvance.service;

import java.util.Set;

import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.model.Monument;

public abstract interface LieuService {
	Set<Lieu> fetchLieuList();
	Set<Monument> getMonumentListByLieuId(String lieu_id);
	Lieu getLieuById(String lieu_id);
}
