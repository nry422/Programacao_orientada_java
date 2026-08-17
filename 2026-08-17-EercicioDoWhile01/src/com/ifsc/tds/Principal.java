package com.ifsc.tds;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Leia 10 números e exiba qual foi o menor número digitado pelo usuário;
		
		int input = 0;
		int contador = 0;
		int menor = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Insira o numero ");
			input = teclado.nextInt();
			
			if (contador == 0 || input < menor) {
				menor = input;
			}
			
			contador++;
			
		} while (contador < 10);
		
		System.out.println("Menor numero: " + menor);
		
		teclado.close();
	}
}