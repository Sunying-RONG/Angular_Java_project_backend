package com.example.projetJavaAvance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetJavaAvance.model.Monument;
import com.example.projetJavaAvance.repository.MonumentRepository;

@Service
public class MonumentServiceImpl implements MonumentService {
	
	@Autowired
	private MonumentRepository monumentRepository;
	
	public MonumentServiceImpl(MonumentRepository monumentRepository) {
		super();
		this.monumentRepository = monumentRepository;
	}

	@Override
	public Monument saveMonument(Monument monument) {
		return monumentRepository.save(monument);
	}

	@Override
	public List<Monument> fetchMonumentList() {
		System.out.println("***in service impl***");
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

}
