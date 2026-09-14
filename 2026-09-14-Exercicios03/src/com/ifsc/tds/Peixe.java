package com.ifsc.tds;

public class Peixe extends Animal {
	
	private String caracteristica;
	
public Peixe(String nome, float comprimento, int nPatas, String cor, String ambiente, float velMedia, String caracteristica) {
		
	super(nome, comprimento, nPatas, cor, ambiente, velMedia);
	
	this.caracteristica = caracteristica;
		
		
	}

public String getCaracteristica() {
	return caracteristica;
}

public void setCaracteristica(String caracteristica) {
	this.caracteristica = caracteristica;
}

public void dadosPeixe() {
	
	super.dados();
	System.out.println("Caracteristica: " + this.caracteristica);
	
	
}


}
