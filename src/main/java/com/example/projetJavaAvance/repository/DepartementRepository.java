package com.example.projetJavaAvance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetJavaAvance.model.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, String> { // JpaRepository

}
