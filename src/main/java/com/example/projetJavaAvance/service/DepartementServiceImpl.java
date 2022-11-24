package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetJavaAvance.model.Departement;
import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.repository.DepartementRepository;
import com.example.projetJavaAvance.repository.LieuRepository;

@Service
public class DepartementServiceImpl implements DepartementService {
	
	@Autowired
	private DepartementRepository departementRepository;
	
	public DepartementServiceImpl(DepartementRepository departementRepository) {
		super();
		this.departementRepository = departementRepository;
	}

	@Override
	public List<Lieu> getLieuListByDepartementId(String departement_id) {
		Optional<Departement> departOp = departementRepository.findById(departement_id);
		if (departOp.isPresent()) {
			return departOp.get().getLieux();
		} else {
			System.out.println("Departement n'existe pas!");
			return null;
		}
	}

}
