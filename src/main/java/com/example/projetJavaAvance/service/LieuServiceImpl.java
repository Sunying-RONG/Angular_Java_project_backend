package com.example.projetJavaAvance.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetJavaAvance.model.Departement;
import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.repository.LieuRepository;

@Service
public class LieuServiceImpl implements LieuService {
	
	@Autowired
	private LieuRepository lieuRepository;
	
	public LieuServiceImpl(LieuRepository lieuRepository) {
		super();
		this.lieuRepository = lieuRepository;
	}

	@Override
	public Set<Monument> getMonumentListByLieuId(String lieu_id) {
		Optional<Lieu> lieuOp =lieuRepository.findById(lieu_id);
		if (lieuOp.isPresent()) {
			return lieuOp.get().getMonuments();
		} else {
			System.out.println("Lieu n'existe pas!");
			return null;
		}
	}

	@Override
	public Set<Lieu> fetchLieuList() {
		List<Lieu> lieuList = lieuRepository.findAll();
		Set<Lieu> lieuSet = new HashSet<>();
		lieuSet.addAll(lieuList);
		return lieuSet;
	}

	@Override
	public Lieu getLieuById(String lieu_id) {
		return lieuRepository.findById(lieu_id).get();
	}

}
