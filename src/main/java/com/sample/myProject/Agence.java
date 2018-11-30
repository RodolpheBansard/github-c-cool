package com.sample.myProject;

import java.util.List;

public class Agence extends Emprunteur {
	private List<Employe> employes;
	private String nom;
	
	public Agence() {
		super();
	}

	public List<Employe> getEmployes() {
		return employes;
	}
}
