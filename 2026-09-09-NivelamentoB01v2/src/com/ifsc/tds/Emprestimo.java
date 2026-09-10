package com.ifsc.tds;

public class Emprestimo {

	private double total;
	private int parcelas;
	private double salario;

	public Emprestimo(double total, int parcelas, double salario) {
		this.total = total;
		this.parcelas = parcelas;
		this.salario = salario;

	}
	
	public void fazerCalculo() {
		double parc = this.total / this.parcelas;
		double trintapercen = this.salario * 0.30;
		
		if ( parc <= trintapercen) {
			System.out.println("Emprestimo aprovado! ");
			System.out.println("Parcela será: R$" + String.format("%.2f", parc));
		} else {
			System.out.println("Emprestimo repovado! ");
		}
	}

}
