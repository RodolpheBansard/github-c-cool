package com.sample.myProject;

public class Employe extends Emprunteur {
	protected Agence agence;
	protected Entreprise entreprise;
	
	public Employe(Agence agence, Entreprise entreprise) {
		super();
		this.agence = agence;
		this.entreprise = entreprise;
	}
	
	
}
