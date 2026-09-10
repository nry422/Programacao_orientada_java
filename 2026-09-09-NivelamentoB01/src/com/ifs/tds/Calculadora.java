package com.ifs.tds;

public class Calculadora {
	public void fazerCalculo(double valortotal, int numparc, double salario) {
		double parc = valortotal / numparc;
		double trintapercen = salario * 0.30;
		
		if ( parc <= trintapercen) {
			System.out.println("Emprestimo aprovado! ");
			System.out.println("Parcela será: R$" + String.format("%.2f", parc));
		} else {
			System.out.println("Emprestimo repovado! ");
		}
	}

}
