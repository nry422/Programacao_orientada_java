package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// 2 – Faça um programa que peça as 4 notas bimestrais, calcule e imprima a média.
		
		double nota = 0;
		double soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i < 4; i++) {
			System.out.println("Insira a nota ");
			nota = teclado.nextDouble();
			soma = soma + nota;
		}
		
		System.out.println("Media: "  + String.format("%.2f", (soma / 4 )));


	}

}
