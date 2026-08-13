package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia o IMC (Índice de MassaCorporal) de uma pessoa;
		 *  Se o resultado for abaixo de 18,5, informe umamensagem de que a pessoa está abaixo do peso;
		 *   Se o resultado for entre 18,5 e 24,99, informe umamensagem de que a pessoa está com peso normal;
		 *   Se o resultado for acima de 25, informe umamensagem de que a pessoa está acima do peso.
		 */
		double  imc = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o IMC: ");
		imc = teclado.nextDouble();
		
		if (imc >= 25) {
			System.out.println("Pessoa acima do Peso!");
		} else if ( imc > 18.5 ) {
			System.out.println("Pesso com peso normal!");
		} else {
			System.out.println("Pessoa abaixo do peso!");
		}
		
		teclado.close();

	}

}
