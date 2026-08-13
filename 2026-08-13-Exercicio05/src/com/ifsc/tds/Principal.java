package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Faça um programa que receba como entrada três valores e os imprima emordem crescente.
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int tempnumero = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o Primeiro Numero: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Insira o Segundo Numero: ");
		numero2 = teclado.nextInt();
		
		System.out.println("Insira o Terceiro Numero: ");
		numero3 = teclado.nextInt();
		
		if (numero1 > numero2) {
			tempnumero = numero1;
			numero1 = numero2;
			numero2 = tempnumero;
			
		} else if (numero3 > numero2) {
			tempnumero = numero1;
			numero1 = numero2;
			numero2 = tempnumero;
		} else {
			maiornumero = numero3;
		}
		
		System.out.println("O maior numero é: " +maiornumero);
		teclado.close();

	}

}
