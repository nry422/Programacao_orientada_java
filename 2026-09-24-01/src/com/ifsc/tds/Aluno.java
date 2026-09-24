package com.ifsc.tds;

public class Aluno extends Pessoa{
	
	private double media;

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public void imprimirDados() {
		System.out.println(this.nome);
	}
	
	

}
