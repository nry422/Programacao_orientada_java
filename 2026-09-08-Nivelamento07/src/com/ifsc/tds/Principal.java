package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia uma temperatura em graus Celsius e apresente-a convertida em graus
Fahrenheit. A fórmula de conversão é:
= -/ ×
+ 160) ÷ 5, na qual
é a temperatura em
�
�
�
Fahrenheit e
é
�
a temperatura em Celsius.
		 */
		
		double temperatura = 0;
		
		conversao convert = new conversao();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius para ser convertida em Fahrenheit: ");
		temperatura = teclado.nextDouble();
		
		convert.paraFahrenheit(temperatura);
		
		teclado.close();

	}

}
