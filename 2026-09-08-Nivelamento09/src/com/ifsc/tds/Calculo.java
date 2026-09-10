package com.ifsc.tds;

public class Calculo {
	
	public void mediaConsumo(double dist, double litros) {
		
		double media = dist / litros;
		System.out.println("Media é: " + String.format("%.2f", media));
	}

}
