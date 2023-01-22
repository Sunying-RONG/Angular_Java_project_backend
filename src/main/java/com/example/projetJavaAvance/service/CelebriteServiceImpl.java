package com.example.projetJavaAvance.service;

import java.util.Collections;
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
import com.example.projetJavaAvance.repository.MonumentRepository;

@Service
public class CelebriteServiceImpl implements CelebriteService {
	
	@Autowired
	private CelebriteRepository celebriteRepository;
	@Autowired
	private MonumentRepository monumentRepository;

	@Override
	public Set<Celebrite> getCelebriteListByMomumentId(String monument_id) {
		Optional<Monument> monumentOp = monumentRepository.findById(monument_id);
		if (monumentOp.isPresent()) {
			return monumentOp.get().getCelebrites();
		} else {
			System.out.println("Monument n'existe pas!");
			return null;
		}
	}

	@Override
	public List<Celebrite> fetchCelebriteList() {
		return celebriteRepository.findAll();
	}

	@Override
	public Celebrite createCelebrite(Celebrite celebrite) {
		return celebriteRepository.save(celebrite);
	}
	
	@Override
	public void deleteCelebrite(int celebrite_id) {
		celebriteRepository.deleteById(celebrite_id);
	}

	@Override
	public Celebrite updateCelebrite(Celebrite celebrite) {
		return celebriteRepository.save(celebrite);
	}

	@Override
	public Celebrite getCelebriteById(int celebrite_id) {
		return celebriteRepository.findById(celebrite_id).get();
	}


	

}
