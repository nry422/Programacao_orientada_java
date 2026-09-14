package com.ifsc.tds;

import java.util.Scanner;

/**
 * Teste.
 * 
 * @author Henry Muller
 * @version 1.0
 */

public class Principal {

	public static void main(String[] args) {
		/*
		 * 10 – Faça um programa para ler e imprimir uma matriz 2 × 4 de números
		 * inteiros.
		 */

		Scanner teclado = new Scanner(System.in);

		int[][] matriz = new int[2][4];
		
		Imprimir imprime = new Imprimir();

		for (int linha = 0; linha < 2; linha++) {

			for (int coluna = 0; coluna < 4; coluna++) {

				System.out.println("Digite o valor para a Linha " + (linha + 1) + ", Coluna " + (coluna + 1) + ": ");
				matriz[linha][coluna] = teclado.nextInt();

			}
		}
		
		imprime.imprime(matriz);
		
		teclado.close();

		
	}

}
