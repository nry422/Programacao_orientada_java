package com.ifsc.tds;

public class Mamifero extends Animal{
	
	private String alimento;
	
	public Mamifero(String nome, float comprimento, int nPatas, String cor, String ambiente, float velMedia, String alimento) {
		
	super(nome, comprimento, nPatas, cor, ambiente, velMedia);
	
	this.alimento = alimento;
		
		
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dadosMamifero() {
		
		super.dados();
		System.out.println("Alimento: " + this.alimento);
		
		
	}

}
