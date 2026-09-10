package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 3 – A jornada de trabalho semanal de um funcionário é de 40 horas. O
		 * funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo
		 * é o valor da hora regular com um acréscimo de 50%. Escreva um programa que
		 * leia o número de horas trabalhadas em um mês, o salário por hora e imprima o
		 * salário total do funcionário, que deverá ser acrescido das horas extras, caso
		 * tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
		 */
		
		Scanner teclado = new Scanner(System.in);
		double horastrabalhadas;
		double salarioh;
		
		System.out.println("Quantas horas foram trabalhadas neste mes? ");
		horastrabalhadas = teclado.nextDouble();
		
		System.out.println("Qual é o valor pago por hora? ");
		salarioh = teclado.nextDouble();
		
		Salario calcularSalario = new Salario(horastrabalhadas, salarioh);
		
		calcularSalario.calcularTotal();
		
		teclado.close();
		
	

	}

}
