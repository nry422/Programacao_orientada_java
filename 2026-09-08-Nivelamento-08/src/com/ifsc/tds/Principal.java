package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um
	automóvel que faz 12Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a
	velocidade média durante ela. Desta forma, será possível obter a distância percorrida com a fórmula
	DISTANCIA = TEMPO × VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de
	combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA ÷ 12. O programa deve
	apresentar os valores da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de
	litros utilizada na viagem.
		 */
		
		double tempogasto = 0;
		double velmedia = 0;
		double distancia = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		Calculo calcular = new Calculo();
		
		System.out.println("O Automovel faz 12km/l");
		System.out.println("Me diga o tempo gasto com a viagem em horas");
		tempogasto = teclado.nextDouble();
		
		System.out.println("Me diga a velocidade media em kmh ");
		velmedia = teclado.nextDouble();
		
		distancia = calcular.calcDistancia(velmedia, tempogasto);
		
		System.out.println("Distancia percorrida: " + String.format("%.2f", distancia));
		System.out.println("Tempo Gasto: " + String.format("%.2f", tempogasto));
		System.out.println("Vel media: " + String.format("%.2f", velmedia));
		
		calcular.litrosUsados(distancia);
		
		teclado.close();

	}

}
