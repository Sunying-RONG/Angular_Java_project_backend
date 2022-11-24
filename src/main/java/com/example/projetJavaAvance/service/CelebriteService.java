package com.example.projetJavaAvance.service;

import java.util.List;
import java.util.Set;

import com.example.projetJavaAvance.model.Monument;

public abstract interface CelebriteService {
	Set<Monument> getMonumentListByCelebriteId(int celebrite_id);
}
