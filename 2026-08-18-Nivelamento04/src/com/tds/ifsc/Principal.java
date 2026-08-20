package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e imprima o primeiro n�mero elevado
		//ao segundo n�mero. Utilize a fun��o de pot�ncia da linguagem.
		
		double base = 0;
		double expoente = 0;
		double result = 0;
		Calcular calcularResultados = new Calcular();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a base: ");
		base = teclado.nextDouble();
		
		System.out.println("Insira o expoente ");
		expoente = teclado.nextDouble();
		
		result = calcularResultados.resultados(base, expoente);
		
		System.out.println("O n�mero " + String.format("%.2f", base) + " elevado a: " + String.format("%.2f", expoente) + " resulta em " + String.format("%.2f", result));
		
		teclado.close();
		

	}

}
