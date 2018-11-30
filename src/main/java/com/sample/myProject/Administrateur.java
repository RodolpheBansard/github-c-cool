package com.sample.myProject;

import java.util.List;

public class Administrateur extends Employe {
	public Administrateur(Agence agence, Entreprise entreprise) {
		super(agence,entreprise);		
	}
	
	public boolean attribuerMateriel(Empruntable empruntable, Emprunteur emprunteur){
		if(this.listeMateriel().contains(empruntable)){
			if(empruntable.isLimitationPretAuxAgences() && (emprunteur.getClass().equals(Agence.class))){
				transferMateriel(this,empruntable,emprunteur);
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}

	public boolean recupérerMateriel(Empruntable empruntable, Emprunteur emprunteur){
		if(emprunteur.listeMateriel().contains(empruntable)){
			transferMateriel(emprunteur,empruntable,this);
			return true;
		}
		else{
			return false;
		}
	}

	public List<Empruntable> stockEntreprise(){
		return super.entreprise.listeMateriel();
	}

	public List<Empruntable> stockAgence(){
		return super.agence.listeMateriel();
	}

	public void transferMateriel(Emprunteur emprunteur1, Empruntable empruntable, Emprunteur emprunteur2){
		if(emprunteur1.perdreMateriel(empruntable)){
			emprunteur2.ajouterAuStock(empruntable);
		}
	}

	public void supprimerMateriel(Empruntable empruntable){
		this.listeMateriel().remove(empruntable);
	}

	public void supprimerMaterielDefecteuxEntreprise(){
		for(Agence agence : super.entreprise.getAgences()){
			supprimerMaterielDefecteuxAgence(agence);
		}
	}

	public void supprimerMaterielDefecteuxAgence(Agence agence){
		for(Employe employe : super.agence.getEmployes()){
			SupprimerMaterielDefecteuxDe(employe);
		}
	}

	private void SupprimerMaterielDefecteuxDe(Emprunteur emprunteur){
		for(Empruntable empruntable : emprunteur.listeMateriel()){
			if(empruntable.isDefectueux()){
				emprunteur.listeMateriel().remove(empruntable);
			}
		}
	}

	public void achatMateriel(Empruntable empruntable){
		this.listMateriel().add(empruntable);
	}
}
