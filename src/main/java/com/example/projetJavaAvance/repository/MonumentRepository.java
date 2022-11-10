package com.example.projetJavaAvance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.projetJavaAvance.model.Monument;

@Repository
public interface MonumentRepository extends CrudRepository<Monument, String> {

}
