package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o dia: ");
		dia = teclado.nextInt();
		switch (dia) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;

		case 3:
			System.out.println("Terça-Feira");
			break;

		case 4:
			System.out.println("Quarta-feira");
			break;

		case 5:
			System.out.println("Quinta-Feira");
			break;

		case 6:
			System.out.println("Sexta-Feira");
			break;

		case 7:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Dia invalido");
			break;

		}
		teclado.close();

	}

}
