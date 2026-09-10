package com.ifsc.tds;

public class Consumo {
	private double qtdcombust;
	private double kmgem;
	
	public Consumo(double qtd, double dist) {
		this.qtdcombust = qtd;
		this.kmgem = dist;
	}
	
	public double calcularConsumo() {
		return this.kmgem / this.qtdcombust;
	}

}
