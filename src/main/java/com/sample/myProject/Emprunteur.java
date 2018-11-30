package com.sample.myProject;

import java.util.ArrayList;
import java.util.List;


public class Emprunteur {
	private List<Empruntable> stock = new ArrayList<>();

	public void setStock(List<Empruntable> stock) {
		this.stock = stock;
	}

	public void ajouterAuStock(Empruntable empruntable) {
		stock.add(empruntable);
	}
	
	public List<Empruntable> listeMateriel(){
		return this.stock;
	}
	
	public boolean perdreMateriel(Empruntable empruntable) {
		if(stock.contains(empruntable)) {
			stock.remove(empruntable);
			return true;
		}
		else {
			return false;
		}
	}
}
