package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public List<Monument> getMonumentListByLieuId(String lieu_id) {
		Optional<Lieu> lieuOp =lieuRepository.findById(lieu_id);
		if (lieuOp.isPresent()) {
			return lieuOp.get().getMonuments();
		} else {
			System.out.println("Lieu n'existe pas!");
			return null;
		}
	}

}
