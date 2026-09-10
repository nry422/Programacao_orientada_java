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
		
		
		Scanner teclado = new Scanner(System.in);		
		
		System.out.println("O Automovel faz 12km/l");
		System.out.println("Me diga o tempo gasto com a viagem em horas");
		tempogasto = teclado.nextDouble();
		
		System.out.println("Me diga a velocidade media em kmh ");
		velmedia = teclado.nextDouble();
		
		Viagem minhaViagem = new Viagem(velmedia, tempogasto);
		
		double distancia = minhaViagem.calcularDistancia();
        double litros = minhaViagem.calcularLitrosUsados();
        
        System.out.println("Distância percorrida: " + String.format("%.2f", distancia) + " km");
        System.out.println("Litros usados: " + String.format("%.2f", litros) + " L");
		
		teclado.close();

	}

}
