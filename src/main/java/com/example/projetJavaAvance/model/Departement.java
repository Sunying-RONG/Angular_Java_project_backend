package com.example.projetJavaAvance.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
 
@Entity
@Table(name="Departement")
public class Departement {
    @Id
    private String departement_id;
    @Column
    private String nomDep;
//    private String chefLieu;
    private String reg;
    
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="departement")
    private List<Lieu> lieux = new ArrayList<>();
    @OneToOne
    @JoinColumn(name="lieu_id", referencedColumnName="lieu_id")
    private Lieu chefLieuObj;
    
    // Required by JPA
    private Departement() {}

	public Departement(String departement_id, String nomDep, String reg, List<Lieu> lieux, Lieu chefLieuObj) {
		super();
		this.departement_id = departement_id;
		this.nomDep = nomDep;
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

	public String getNomDep() {
		return nomDep;
	}

	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
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
		return "Departement [departement_id=" + departement_id + ", nomDep=" + nomDep + ", reg=" + reg + ", lieux="
				+ lieux + ", chefLieuObj=" + chefLieuObj + "]";
	}
 
 
}
