package com.example.projetJavaAvance.service;

import java.util.List;

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
}
