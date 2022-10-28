package com.example.projetJavaAvance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
 
@Entity
public class Celebrite {
	@Column
	@Id
    private int    numCelebrite;
    private String nom;
    private String prenom;
    private String nationalite;
    private String epoque;
//    @ManyToMany
//    @JoinTable(name = "celebrite_monument",
//    		joinColumns = @JoinColumn(name = "numCelebrite"),
//    		inverseJoinColumns = @JoinColumn(name = "geohash"))
//    private Set<Monument> monuments = new HashSet<Monument>();
    
    // Required by JPA
    private Celebrite() {}
 
    public Celebrite(int numCelebrite, String nom, String prenom, String nationalite, String epoque) {
    	this.numCelebrite = numCelebrite;
    	this.nom = nom;
    	this.prenom = prenom;
    	this.nationalite = nationalite;
    	this.epoque = epoque;
    }
    
//    public Set<Monument> getMonuments() {
//    	return monuments;
//    }

	public int getNumCelebrite() {
		return numCelebrite;
	}

	public void setNumCelebrite(int numCelebrite) {
		this.numCelebrite = numCelebrite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getEpoque() {
		return epoque;
	}

	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}

	@Override
	public String toString() {
		return "Celebrite [numCelebrite=" + numCelebrite + ", nom=" + nom + ", prenom=" + prenom + ", nationalite="
				+ nationalite + ", epoque=" + epoque + "]";
	}
 
}
