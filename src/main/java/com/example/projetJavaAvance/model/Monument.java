package com.example.projetJavaAvance.model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
 
@Entity
@Table(name = "monument")
public class Monument {
    // Required by JPA
	@Id
    private String      geohash;
    @Column
    private String      nom;
    private String      proprietaire;
    private String      typeM;
    private float      longitude;
    private float      latitude;
//    private String   	codeInsee; // foreign key
//  table monument contient une colonne qui est une clé étrangère contenant la clé d’une lieu, lieu_id
    @ManyToOne
    @JoinColumn(name="codeInsee")
    private Lieu lieu;
    
    @ManyToMany
    @JoinTable(name="AssocieA",
    		joinColumns=@JoinColumn(name="codeM"),
    		inverseJoinColumns=@JoinColumn(name="numCelebrite"))
    private List<Celebrite> celebrites;
    
    public Monument() {}
 
    public Monument(String geohash, String nom, String proprietaire, String typeM, float longitude, float latitude, String codeInsee) {
    	this.geohash = geohash;
    	this.nom = nom;
    	this.proprietaire = proprietaire;
    	this.typeM = typeM;
    	this.longitude = longitude;
    	this.latitude = latitude;
//    	this.codeInsee = codeInsee;
    }
    public List<Celebrite> getCelebrites() {
    	return celebrites;
    }
    
    public Lieu getLieu() {
    	return lieu;
    }

	public String getGeohash() {
		return geohash;
	}

	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getTypeM() {
		return typeM;
	}

	public void setTypeM(String typeM) {
		this.typeM = typeM;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

//	public String getCodeInsee() {
//		return codeInsee;
//	}
//
//	public void setCodeInsee(String codeInsee) {
//		this.codeInsee = codeInsee;
//	}

	@Override
	public String toString() {
		return "Monument [geohash=" + geohash + ", nom=" + nom + ", proprietaire=" + proprietaire + ", typeM=" + typeM
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", codeInsee= ]";
	}
 
   
 
  
 
}

