package com.example.projetJavaAvance.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetJavaAvance.model.Departement;
import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService {
	
	@Autowired
	private DepartementRepository departementRepository;
	
	public DepartementServiceImpl(DepartementRepository departementRepository) {
		super();
		this.departementRepository = departementRepository;
	}

	@Override
	public Set<Lieu> getLieuListByDepartementId(String departement_id) {
		Optional<Departement> departOp = departementRepository.findById(departement_id);
		if (departOp.isPresent()) {
			return departOp.get().getLieux();
		} else {
			System.out.println("Departement n'existe pas!");
			return null;
		}
	}

	@Override
	public Set<Departement> fetchDepartementList() {
		List<Departement> departementList = departementRepository.findAll();
		Set<Departement> departementSet = new HashSet<>();
		departementSet.addAll(departementList);
		return departementSet;
	}

	@Override
	public Lieu getChefLieu(String departement_id) {
		return departementRepository.findById(departement_id).get().getChefLieuObj();
	}

}
