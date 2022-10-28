package com.example.projetJavaAvance.model;
import java.util.List;

import javax.persistence.*;
 
@Entity
@Table(name="Departement")
public class Departement {
    @Id
    private String dep;
    @Column
    private String nomDep;
    private String chefLieu;
    private String reg;
    @OneToMany(mappedBy="depart")
    private List<Lieu> lieux;
    // Required by JPA
    private Departement() {}
 
    public Departement(String dep, String nomDep, String chefLieu, String reg) {
    	this.dep = dep;
        this.nomDep = nomDep;
        this.chefLieu = chefLieu;
        this.reg = reg;
    }
    
    public List<Lieu> getLieux() {
    	return lieux;
    }

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getNomDep() {
		return nomDep;
	}

	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}

	public String getChefLieu() {
		return chefLieu;
	}

	public void setChefLieu(String chefLieu) {
		this.chefLieu = chefLieu;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	@Override
	public String toString() {
		return "Departement [dep=" + dep + ", nomDep=" + nomDep + ", chefLieu=" + chefLieu + ", reg=" + reg + "]";
	}
   
 
}

