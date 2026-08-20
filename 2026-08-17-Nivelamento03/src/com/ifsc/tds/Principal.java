package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Faça um programa para calcular a área de uma circunferência, considerando a fórmula AREA = π × RAIO2.
Utilize as variáveis AREA e RAIO, a constante π (pi = 3,14159) e os operadores aritméticos de multiplicação.pi = 3,14159) e os operadores aritméticos de multiplicação.) e os operadores aritméticos de multiplicação */
	double area = 0;
	double raio = 0;
	Area calcularArea = new Area();
			
	Scanner teclado = new Scanner(System.in);
	
	
	System.out.println("Insira o raio: ");
	raio = teclado.nextDouble();
	
	area = calcularArea.fazer(raio);
	
	
	
	System.out.println("Area é " +area);
	
	teclado.close();
	
	
	
	}

}
