package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Crie um algoritmo que leia a nota de um aluno e mostrese ele está aprovado
		// (>= 60), reprovado (< 20), e emrecuperação (< 60).
		int nota = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a nota do aluno:");
		nota = teclado.nextInt();

		if (nota >= 60) {
			System.out.println("Aprovado!");
		} else if (nota >= 20) {
			System.out.println("Em recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		teclado.close();

	}

}
