package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade;
		double salario;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
		idade = teclado.nextInt();
		System.out.println("Digite o seu salario:");
		salario = teclado.nextDouble();
		
		System.out.println("Relatorio");
		System.out.println("Sua idade: " + idade);
		System.out.println("Seu salario: " + String.format("%.2f", salario));
		
		teclado.close();

	}

}
