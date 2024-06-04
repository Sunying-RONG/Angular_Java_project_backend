package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Set;

import com.example.projetJavaAvance.model.Departement;
import com.example.projetJavaAvance.model.Lieu;

public abstract interface DepartementService {
	Set<Departement> fetchDepartementList();
	Set<Lieu> getLieuListByDepartementId(String departement_id);
	Lieu getChefLieu(String departement_id);
}
