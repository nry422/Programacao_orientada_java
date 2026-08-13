package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Compare 3 números inteiros e encontre o maior e o menor número.
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int maiornumero = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o Primeiro Numero: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Insira o Segundo Numero: ");
		numero2 = teclado.nextInt();
		
		System.out.println("Insira o Terceiro Numero: ");
		numero3 = teclado.nextInt();
		
		if (numero1 > numero2) {
			maiornumero = numero1;
		} else if (numero2 > numero3) {
			maiornumero = numero2;
		} else {
			maiornumero = numero3;
		}
		
		System.out.println("O maior numero é: " +maiornumero);
		teclado.close();

	}

}
