package com.example.projetJavaAvance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.projetJavaAvance.model.Monument;

@Repository
public interface MonumentRepository extends JpaRepository<Monument, String> { // JpaRepository

}
