package com.example.projetJavaAvance.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
 
@Entity
@Table(name="Departement")
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "departement_id")
public class Departement {
    @Id
    private String departement_id;
    @Column
    private String nom_dep;
//    private String chefLieu;
    private String reg;
    
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="departement")
    @JsonBackReference
    private List<Lieu> lieux = new ArrayList<>();
    
    @OneToOne
    @JoinColumn(name="lieu_id", referencedColumnName="lieu_id")
    @JsonIgnore
    private Lieu chefLieuObj;
    
    // Required by JPA
    public Departement() {}

	public Departement(String departement_id, String nom_dep, String reg, List<Lieu> lieux, Lieu chefLieuObj) {
		super();
		this.departement_id = departement_id;
		this.nom_dep = nom_dep;
		this.reg = reg;
		this.lieux = lieux;
		this.chefLieuObj = chefLieuObj;
	}

	public String getDepartement_id() {
		return departement_id;
	}

	public void setDepartement_id(String departement_id) {
		this.departement_id = departement_id;
	}

	public String getNom_dep() {
		return nom_dep;
	}

	public void setNom_Dep(String nom_dep) {
		this.nom_dep = nom_dep;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public List<Lieu> getLieux() {
		return lieux;
	}

	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}

	public Lieu getChefLieuObj() {
		return chefLieuObj;
	}

	public void setChefLieuObj(Lieu chefLieuObj) {
		this.chefLieuObj = chefLieuObj;
	}

	@Override
	public String toString() {
		return "Departement [departement_id=" + departement_id + ", nom_dep=" + nom_dep + ", reg=" + reg + ", lieux="
				+ lieux + ", chefLieuObj=" + chefLieuObj + "]";
	}
 
 
}

