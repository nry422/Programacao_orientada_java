package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Faça um programa que peça dois números, base e expoente, calcule e imprima o primeiro número elevado
		//ao segundo número. Utilize a função de potência da linguagem.
		
		double base = 0;
		double expoente = 0;
		double result = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a base: ");
		base = teclado.nextDouble();
		
		System.out.println("Insira o expoente ");
		expoente = teclado.nextDouble();
		
		result = Math.pow(base, expoente);
		
		System.out.println("O número " + String.format("%.2f", base) + " elevado a: " + String.format("%.2f", expoente) + " resulta em " + String.format("%.2f", result));
		
		teclado.close();
		

	}

}
