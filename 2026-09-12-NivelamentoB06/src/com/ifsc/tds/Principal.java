package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 6 – Escreva um programa que pergunte ao usuário um número e após, imprima na
		 * tela a soma total de 1 até o número lido. Exemplo: 5: 1 + 2 + 3 + 4 + 5 = 15.
		 * 
		 */

		Scanner teclado = new Scanner(System.in);
		int numerosoma = 0;
		Calculator calcula = new Calculator();
		
	

		System.out.println("Insira o número que deseja para observar o total da soma entre 1 e o numero escolhido: ");
		numerosoma = teclado.nextInt();
		
		calcula.resultado(numerosoma);
		
		
		teclado.close();

	}

}
