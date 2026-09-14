package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 8 – Número primo é aquele que só é divisível por ele mesmo e pelo número 1.
		 * Faça um programa que determine e imprima os números primos compreendidos
		 * entre um intervalo fornecido pelo usuário.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int numeroIni = 0;
		int numeroFim = 0;
		Calculadora primos = new Calculadora();
		
		System.out.println("Digite o primeiro numero para detectarmos os numeros primos entre ele e o numero final");
		numeroIni = teclado.nextInt();
		
		System.out.println("Digite o Ultimo numero");
		numeroFim = teclado.nextInt();
		
		primos.acharPrimos(numeroIni, numeroFim);

	}

}
