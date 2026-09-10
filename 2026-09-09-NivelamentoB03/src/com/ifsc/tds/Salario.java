package com.ifsc.tds;

public class Salario {
	
	private double horasmes;
	private double salariohora;
	
	public Salario(double horas, double paghoras) {
		
		this.horasmes = horas;
		this.salariohora = paghoras;
		
	}
	
	public void calcularTotal() {
		if (this.horasmes <= 160) {
			double total = (this.horasmes * this.salariohora);
			System.out.println("Total pago de salario este mês: " + String.format("%.2f", total));
		} else {
			double total = (this.salariohora * 160) + (((this.horasmes - 160) * this.salariohora) * 1.5);
			System.out.println("Total pago de salario este mês: " + String.format("%.2f", total));
		}
	}

}
