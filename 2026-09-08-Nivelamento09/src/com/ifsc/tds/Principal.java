package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*/ TODO Auto-generated method stub
		 * / – Faça um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total
percorrida pelo automóvel e o total de combustível gasto.
		 */
		
		Scanner teclado = new Scanner(System.in);
		double distancia = 0;
		double combustivel = 0;
		Calculo mediaCons = new Calculo();
		
		
		System.out.println("Distancia percorrida em KM: ");
		distancia = teclado.nextDouble();
		
		System.out.println("Combustivel gasto em litros: ");
		combustivel = teclado.nextDouble();
		
		mediaCons.mediaConsumo(distancia, combustivel);
		
		
		
		

	}

}
