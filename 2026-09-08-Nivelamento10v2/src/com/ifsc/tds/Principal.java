package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 10 – Faça um programa que leia os valores de COMPRIMENTO, LARGURA e ALTURA e
		 * apresente o valor do volume de uma caixa retangular. Utilize para o cálculo a
		 * fórmula VOLUME = COMPRIMENTO × LARGURA × ALTURA.
		 */
		
		Scanner teclado = new Scanner(System.in);
		double comp, largura, altura;
		
		
		System.out.println("Insira o comprimento: ");
		comp = teclado.nextDouble();
		
		System.out.println("Insira a largura: ");
		largura = teclado.nextDouble();
		
		System.out.println("Insira a altura: ");
		altura = teclado.nextDouble();
		
		Volume calculoVol = new Volume(comp, largura, altura);
		
		calculoVol.fazerCalculo();
		
		
		teclado.close();
		
		

	}

}
