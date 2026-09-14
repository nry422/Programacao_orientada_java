package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 7 – Construa um programa que exiba a tabuada de 1 até N, onde N é informado
		 * pelo usuário. ex: Até a tabuada de 3, imprimirá as tabuadas de 1, 2 e 3.
		 */

		Scanner teclado = new Scanner(System.in);
		int numerotabuada = 0;
		Calcular tabuadas = new Calcular();

		System.out.println("Insira o numero desejado, ser exibidas as tabuadas até este valor");
		numerotabuada = teclado.nextInt();

		tabuadas.tabuador(numerotabuada);

		teclado.close();
	}

}
