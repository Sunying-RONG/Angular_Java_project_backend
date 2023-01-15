package com.example.projetJavaAvance.service;

import java.util.List;

import com.example.projetJavaAvance.model.Departement;
import com.example.projetJavaAvance.model.Lieu;

public abstract interface DepartementService {
	List<Departement> fetchDepartementList();
	List<Lieu> getLieuListByDepartementId(String departement_id);
	Lieu getChefLieu(String departement_id);
}
