package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Set;

import com.example.projetJavaAvance.model.Celebrite;
import com.example.projetJavaAvance.model.Monument;

public abstract interface MonumentService {
	Monument saveMonument(Monument monument, String lieu_id);
	List<Monument> fetchMonumentList();
	Monument getMonumnetById(String monument_id);
	Monument updateMonument(Monument monument, String lieu_id);
	void deleteMonumentById(String monument_id);
	Set<Monument> getMonumentListByCelebriteId(int celebrite_id);
	Monument addCelebrite(Celebrite[] celebrites, String monument_id);
}
