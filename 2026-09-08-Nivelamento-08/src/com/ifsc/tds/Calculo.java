package com.ifsc.tds;

public class Calculo {
	
	public double calcDistancia(double velo, double tempo) {
		double calcdist = velo * tempo;
		return calcdist;
		
	}

	public void litrosUsados(double dist) {
		double litros = dist /12;
		System.out.println("Litros usados: " + String.format("%.2f", litros));
	}

	

}
