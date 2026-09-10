package com.ifs.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 1 – Faça um programa para aprovar empréstimos bancários. O código deve pedir
		 * três informações: valor do empréstimo, número de parcelas e salário do
		 * solicitante. Aprovar empréstimo caso o valor das parcelas representem no
		 * máximo 30% do salário do solicitante.
		 */
		
		Scanner teclado = new Scanner(System.in);
		double emprestimo = 0;
		int numparc = 0;
		double salario = 0;
		Calculadora calcular = new Calculadora();
		
		System.out.println("Insira o valor a ser emprestado: ");
		emprestimo = teclado.nextDouble();
		
		System.out.println("Insira o numero de parcelas: ");
		numparc = teclado.nextInt();
		
		System.out.println("Insira o seu salario: ");
		salario = teclado.nextDouble();
		
		calcular.fazerCalculo(emprestimo, numparc, salario);
		

	}

}
