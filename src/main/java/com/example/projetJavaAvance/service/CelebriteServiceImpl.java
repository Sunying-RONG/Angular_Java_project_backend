package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetJavaAvance.model.Celebrite;
import com.example.projetJavaAvance.model.Departement;
import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.repository.CelebriteRepository;
import com.example.projetJavaAvance.repository.DepartementRepository;
import com.example.projetJavaAvance.repository.LieuRepository;

@Service
public class CelebriteServiceImpl implements CelebriteService {
	
	@Autowired
	private CelebriteRepository celebriteRepository;
	
	public CelebriteServiceImpl(CelebriteRepository celebriteRepository) {
		super();
		this.celebriteRepository = celebriteRepository;
	}

	@Override
	public Set<Monument> getMonumentListByCelebriteId(int celebrite_id) {
		Optional<Celebrite> celebriteOp = celebriteRepository.findById(celebrite_id);
		if (celebriteOp.isPresent()) {
			return celebriteOp.get().getMonuments();
		} else {
			System.out.println("Celebrite n'existe pas!");
			return null;
		}
	}

}
