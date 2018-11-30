package com.sample.myProject;


import java.util.ArrayList;
import java.util.List;

public class Entreprise extends Emprunteur {
	private List<Agence> agences = new ArrayList<>();
	private List<Employe> employes = new ArrayList<>();
	private String nomEntreprise;
	
	public Entreprise(String nomEntreprise) {
		super();
		this.nomEntreprise = nomEntreprise;
	}

	public List<Agence> getAgences() {
		return agences;
	}
}
