package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Set;

import com.example.projetJavaAvance.model.Celebrite;
import com.example.projetJavaAvance.model.Monument;

public abstract interface MonumentService {
	Monument saveMonument(Monument monument);
	List<Monument> fetchMonumentList();
	Monument getMonumnetById(String monument_id);
	Monument updateMonument(Monument monument, String geohash);
	void deleteMonumentById(String geohash);
	Set<Monument> getMonumentListByCelebriteId(int celebrite_id);

}
