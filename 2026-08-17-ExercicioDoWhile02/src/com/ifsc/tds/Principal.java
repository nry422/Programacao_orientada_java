package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Leia 2 números e exiba qual foi o maior número digitado pelo usuário;
		
		double entrada = 0;
		double maior = 0;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Insira o numero: ");
			entrada = teclado.nextDouble();
			
			if (contador == 0 || entrada > maior) {
				maior = entrada;
			}
			
			contador++;
			
		} while (contador < 20);
		
		System.out.println("Maior numero digitado é: " + maior);
		
		teclado.close();
		
	

	}

}
