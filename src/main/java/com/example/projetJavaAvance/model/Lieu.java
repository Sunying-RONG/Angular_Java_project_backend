package com.example.projetJavaAvance.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
 
@Entity
public class Lieu {
    @Id
    private String lieu_id;
//    @Column(name="nomCom")
    private String nom;
    private float longitude;
    private float latitude;

    
    @ManyToOne
    @JoinColumn(name = "departement_id", referencedColumnName="departement_id") 
    @OneToOne(mappedBy="chefLieuObj")
    private Departement departement;
    @OneToMany(mappedBy="lieu")
    private List<Monument> monuments = new ArrayList<>();
    
    // Required by JPA
    private Lieu() {}

	public Lieu(String lieu_id, String nom, float longitude, float latitude, Departement departement,
			List<Monument> monuments) {
		super();
		this.lieu_id = lieu_id;
		this.nom = nom;
		this.longitude = longitude;
		this.latitude = latitude;
		this.departement = departement;
		this.monuments = monuments;
	}

	public String getCodeInsee() {
		return lieu_id;
	}

	public void setCodeInsee(String lieu_id) {
		this.lieu_id = lieu_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public List<Monument> getMonuments() {
		return monuments;
	}

	public void setMonuments(List<Monument> monuments) {
		this.monuments = monuments;
	}

	@Override
	public String toString() {
		return "Lieu [codeInsee=" + lieu_id + ", nom=" + nom + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", departement=" + departement + ", monuments=" + monuments + "]";
	}
 
   
 
}

