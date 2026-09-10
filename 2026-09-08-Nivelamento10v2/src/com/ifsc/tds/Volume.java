package com.ifsc.tds;

public class Volume {
	
	private double comp;
	private double lar;
	private double alt;
	
	public Volume(double comp, double lar, double alt) {
		this.comp = comp;
		this.lar = lar;
		this.alt = alt;
	}
	
	public void fazerCalculo() {
		System.out.println("Volume é: " + String.format("%.2f", (this.comp * this.lar * this.alt)));
		
	}

}
