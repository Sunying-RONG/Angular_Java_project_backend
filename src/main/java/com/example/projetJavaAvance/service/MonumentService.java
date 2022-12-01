package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Set;

import com.example.projetJavaAvance.model.Celebrite;
import com.example.projetJavaAvance.model.Monument;

public abstract interface MonumentService {
	// save operation
	Monument saveMonument(Monument monument);
	// read operation
	List<Monument> fetchMonumentList();
	// update operation
	Monument updateMonument(Monument monument, String geohash);
	// delete operation
	void deleteMonumentById(String geohash);
	
	Set<Monument> getMonumentListByCelebriteId(int celebrite_id);

}
