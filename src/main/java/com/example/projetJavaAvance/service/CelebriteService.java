package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Set;

import com.example.projetJavaAvance.model.Celebrite;
import com.example.projetJavaAvance.model.Monument;

public abstract interface CelebriteService {
	
	List<Celebrite> fetchCelebriteList();
	
	Set<Celebrite> getCelebriteListByMomumentId(String monument_id);
	
	Celebrite createCelebrite(Celebrite celebrite);
	
	void deleteCelebrite(int celebrite_id);
	
	Celebrite updateCelebrite(Celebrite celebrite);
	
	Celebrite getCelebriteById(int celebrite_id);

}
