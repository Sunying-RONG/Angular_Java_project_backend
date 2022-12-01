package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Set;

import com.example.projetJavaAvance.model.Celebrite;
import com.example.projetJavaAvance.model.Monument;

public abstract interface CelebriteService {
	
	
	Set<Celebrite> getCelebriteListByMomumentId(String monument_id);

}
