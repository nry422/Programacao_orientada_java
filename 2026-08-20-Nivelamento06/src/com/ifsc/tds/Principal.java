package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Leia um número inteiro;
		//Leia um segundo número inteiro;
		//Efetue a adição dos dois valores;
		//Apresente o valor calculado.
		
		int n1 = 0;
		int n2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		n1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero:");
		n2 = teclado.nextInt();
		
		Adicao calcular = new Adicao();
		
		calcular.calcularAdicao(n1, n2);
		
		teclado.close();
		

	}

}
