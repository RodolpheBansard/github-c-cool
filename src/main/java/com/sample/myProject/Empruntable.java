package com.sample.myProject;

public class Empruntable {
	private boolean limitationPretAuxAgence;
	private boolean defectueux;
	

	public void declarerDefectueux() {
		this.defectueux = false;
	}
	
	public boolean isDefectueux() {
		return this.defectueux;
	}
	
	public boolean isLimitationPretAuxAgences() {
		return this.limitationPretAuxAgence;
	}
	

	public void setLimitationPretAuxAgence(boolean limitationPretAuxAgence) {
		this.limitationPretAuxAgence = limitationPretAuxAgence;
	}
	
	
}
