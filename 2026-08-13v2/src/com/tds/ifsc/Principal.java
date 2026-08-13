package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int maiorIdade = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
		maiorIdade = teclado.nextInt();

		if (maiorIdade >= 18) {
			System.out.println("Maior de Idade!");
		} else {
			System.out.println("Menor de Idae!");
		}
		teclado.close();
	}

}
