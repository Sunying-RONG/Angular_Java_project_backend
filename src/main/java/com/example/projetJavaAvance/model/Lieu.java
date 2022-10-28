package com.example.projetJavaAvance.model;
import java.util.List;

import javax.persistence.*;
 
@Entity
public class Lieu {
    @Id
    private String codeInsee;
    @Column(name="nomCom")
    private String nom;
    private float longitude;
    private float latitude;
    private String depart;
//  Monument table must have a foreign key column "codeInsee" that references the Lieu table's "codeInsee" column.
//    @OneToMany
//    @JoinColumn(name = "codeInsee", referencedColumnName = "codeInsee") 
//    private List<Monument> monuments;
    
//    bidirection
//    @OneToMany(mappedBy = "lieu")
//    private List<Monument> monuments;
    
//    @ManyToOne
//    @JoinColumn(name = "dep") 
//    private Departement departement;
    
    // Required by JPA
    private Lieu() {}
 
    public Lieu(String codeInsee, String nom, float longitude, float latitude, String depart) {
    	this.codeInsee = codeInsee;
        this.nom = nom;
        this.longitude = longitude;
        this.latitude = latitude;
        this.depart = depart;
    }
//    public List<Monument> getMonuments() {
//    	return monuments;
//    }
    
//    public Departement getDepartment() {
//    	return departement;
//    }
    public String getNom() {
        return nom;
    }
   
    public String getCodeInsee() {
        return codeInsee;
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

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Lieu [codeInsee=" + codeInsee + ", nom=" + nom + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", depart=" + depart + "]";
	}
 
}

