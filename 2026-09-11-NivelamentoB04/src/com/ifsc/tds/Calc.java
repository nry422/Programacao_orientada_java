package com.ifsc.tds;

public class Calc {
	
	/*
	 * 4 – Faça um programa para uma empresa que decide dar um reajuste funcionários
	 * de acordo com os seguintes critérios: •50% para aqueles que ganham menos do
	 * que três salários mínimos; •20% para aqueles que ganham entre três até dez
	 * salários mínimos; •15% para aqueles que ganham acima de dez até vinte
	 * salários mínimos; •10% para os demais funcionários.
	 */
	
	public double calcReajuste(double salariobase, double salariominimo) {
		double reajustado;
		
		if ( salariobase < salariominimo * 3) {
			reajustado = salariobase * 1.5;
		} else if (salariobase <= salariominimo * 10) {
			reajustado = salariobase * 1.2;
		} else if (salariobase <= salariominimo * 20) {
			reajustado = salariobase * 1.15;
		} else {
			reajustado = salariobase * 1.10;
		}
		
		return reajustado;
	}

}
