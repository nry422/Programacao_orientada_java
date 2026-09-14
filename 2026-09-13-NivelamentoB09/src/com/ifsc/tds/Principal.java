package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 9 – Fazer um algoritmo que calcule e imprima o soma, a média, o maior e o
		 * menor dos valores armazenados em um vetor A de 7 elementos numéricos a serem
		 * lidos do dispositivo de entrada padrão.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		double[] vetora = new double[7];
		
		for (int i = 0; i < vetora.length; i++ ) {
			
			System.out.println("Insira o numero " + (i+1 + " de 7"));
			vetora[i] = teclado.nextDouble();
		}
		
		Calculos calcular = new Calculos(vetora);
		
		calcular.soma(); //se usar media antes de soma vai quebrar, estou ciente,
		
		calcular.media();
		
		calcular.maior();
		
		calcular.menor();
		
		
		
		teclado.close();

	}

}
