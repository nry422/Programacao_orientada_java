package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double totalNotas= 0;
		Scanner teclado = new Scanner(System.in);
		Boletim classecalculanotas = new Boletim();
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Qual é a nota " + (i+1) + "?");
			totalNotas += teclado.nextDouble();
		}
		
		totalNotas = classecalculanotas.calcularMedia(totalNotas);
		System.out.println("A média é: " + String.format("%.2f", totalNotas));
		teclado.close();

	}

}