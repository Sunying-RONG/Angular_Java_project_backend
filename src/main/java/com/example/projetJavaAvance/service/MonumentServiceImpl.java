package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetJavaAvance.model.Celebrite;
import com.example.projetJavaAvance.model.Lieu;
import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.repository.CelebriteRepository;
import com.example.projetJavaAvance.repository.LieuRepository;
import com.example.projetJavaAvance.repository.MonumentRepository;

@Service
public class MonumentServiceImpl implements MonumentService {
	
	@Autowired
	private MonumentRepository monumentRepository;
	@Autowired
	private CelebriteRepository celebriteRepository;
	@Autowired
	private LieuRepository lieuRepository;
	
//	public MonumentServiceImpl(MonumentRepository monumentRepository) {
//		super();
//		this.monumentRepository = monumentRepository;
//	}

	@Override
	public Monument saveMonument(Monument monument, String lieu_id) {
		Lieu lieu = lieuRepository.findById(lieu_id).get();
		monument.setLieu(lieu);
		return monumentRepository.save(monument);
	}

	@Override
	public List<Monument> fetchMonumentList() {
		return monumentRepository.findAll();
	}

	@Override
	public Monument updateMonument(Monument monument, String geohash) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMonumentById(String geohash) {
		monumentRepository.deleteById(geohash);
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

	@Override
	public Monument getMonumnetById(String monument_id) {
		return monumentRepository.findById(monument_id).get();
	}

}
