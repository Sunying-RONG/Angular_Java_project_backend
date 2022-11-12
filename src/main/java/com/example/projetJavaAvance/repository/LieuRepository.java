package com.example.projetJavaAvance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetJavaAvance.model.Lieu;

@Repository
public interface LieuRepository extends JpaRepository<Lieu, String> { // JpaRepository

}
