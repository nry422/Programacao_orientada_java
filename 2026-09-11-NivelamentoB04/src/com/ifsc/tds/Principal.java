package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 4 – Faça um programa para uma empresa que decide dar um reajuste funcionários
		 * de acordo com os seguintes critérios: •50% para aqueles que ganham menos do
		 * que três salários mínimos; •20% para aqueles que ganham entre três até dez
		 * salários mínimos; •15% para aqueles que ganham acima de dez até vinte
		 * salários mínimos; •10% para os demais funcionários.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		double salario;
		double salariominimo;		
		double novosalario;
		Calc calcular = new Calc();
		
		System.out.println("Informe o salario atual do funcionario: ");
		salario = teclado.nextDouble();
		
		System.out.println("Informe o valor atual do salario minimo: ");
		salariominimo = teclado.nextDouble();
		
		novosalario = calcular.calcReajuste(salario, salariominimo);
		
		System.out.println("O Salario reajustado é de: " + String.format("%.2f", novosalario) + " Reais");
		
		teclado.close();
		
		
		

	}

}
