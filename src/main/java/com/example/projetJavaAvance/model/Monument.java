package com.example.projetJavaAvance.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "monument_id")
public class Monument {
    // Required by JPA
	@Id
    private String      monument_id;
    @Column
    private String      nom;
    private String      proprietaire;
    private String      typeM;
    private float      longitude;
    private float      latitude;
//    private String   	codeInsee; // foreign key

    
    @ManyToOne
    @JoinColumn(name="lieu_id", referencedColumnName="lieu_id") // first lieu_id est de Monument, second lieu_id est de Lieu ?
//    @JsonBackReference
    private Lieu lieu;
    
    @ManyToMany(targetEntity = Celebrite.class)
    @JoinTable(name="AssocieA",
    		joinColumns=@JoinColumn(name="monument_id", referencedColumnName = "monument_id"),
    		inverseJoinColumns=@JoinColumn(name="celebrite_id", referencedColumnName = "celebrite_id"))
//    @JsonIgnore
    private Set<Celebrite> celebrites;
    
    public Monument() {}

	public Monument(String monument_id, String nom, String proprietaire, String typeM, float longitude, float latitude,
			Lieu lieu, Set<Celebrite> celebrites) {
		super();
		this.monument_id = monument_id;
		this.nom = nom;
		this.proprietaire = proprietaire;
		this.typeM = typeM;
		this.longitude = longitude;
		this.latitude = latitude;
		this.lieu = lieu;
		this.celebrites = celebrites;
	}

	public String getMonument_id() {
		return monument_id;
	}

	public void setMonument_id(String monument_id) {
		this.monument_id = monument_id;
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

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Set<Celebrite> getCelebrites() {
		return celebrites;
	}

	public void setCelebrites(Set<Celebrite> celebrites) {
		this.celebrites = celebrites;
	}

	@Override
	public String toString() {
		return "Monument [monument_id=" + monument_id + ", nom=" + nom + ", proprietaire=" + proprietaire + ", typeM="
				+ typeM + ", longitude=" + longitude + ", latitude=" + latitude + ", lieu=" + lieu + ", celebrites="
				+ celebrites + "]";
	}
 
 
}

