package com.example.projetJavaAvance.service;

import java.util.List;

import com.example.projetJavaAvance.model.Lieu;

public abstract interface DepartementService {
	List<Lieu> getLieuListByDepartementId(String departement_id);
}
