package com.example.projetJavaAvance.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
 
@Entity
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "celebrite_id")
public class Celebrite {
	@Column
	@Id
    private int    celebrite_id;
    private String nom;
    private String prenom;
    private String nationalite;
    private String epoque;
    
//    FilterProvider filters = new SimpleFilterProvider().addFilter(
//            "celebriteIdFilter", SimpleBeanPropertyFilter.filterOutAllExcept("celebrite_id"));
    
    @ManyToMany(mappedBy="celebrites")
    @JsonIgnore
    private Set<Monument> monuments;
    
    // Required by JPA
    public Celebrite() {}

	public Celebrite(int celebrite_id, String nom, String prenom, String nationalite, String epoque,
			Set<Monument> monuments) {
		super();
		this.celebrite_id = celebrite_id;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.epoque = epoque;
		this.monuments = monuments;
	}

	public int getCelebrite_id() {
		return celebrite_id;
	}

	public void setCelebrite_id(int celebrite_id) {
		this.celebrite_id = celebrite_id;
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

	public Set<Monument> getMonuments() {
		return monuments;
	}

	public void setMonuments(Set<Monument> monuments) {
		this.monuments = monuments;
	}

	@Override
	public String toString() {
		return "Celebrite [celebrite_id=" + celebrite_id + ", nom=" + nom + ", prenom=" + prenom + ", nationalite="
				+ nationalite + ", epoque=" + epoque + ", monuments=" + monuments + "]";
	}
 
 
}
