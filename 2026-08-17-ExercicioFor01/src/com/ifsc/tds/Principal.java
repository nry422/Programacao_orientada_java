package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Faça um algoritmo para calcular a média de 3 números. O
		//usuário deve digitar a entrada de dados.
		
		double[] n = new double[3];
		double sum = 0;
		double avg = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i<3; i++) {
		System.out.println("Insira o numero:");
		n[i] = teclado.nextDouble();
		sum = sum + n[i]; }
		
		avg = sum / 3;
		
		System.out.println("Media: " + String.format("%.2f", avg));
		teclado.close();
		
		

	}

}
