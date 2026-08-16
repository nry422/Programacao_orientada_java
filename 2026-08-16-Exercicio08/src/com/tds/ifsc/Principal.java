package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// A jornada de trabalho semanal de um funcionário é de 40 horas. 
		//Ofuncionário que trabalhar mais de 40 horas receberá hora extra, 
		//cujocálculo é o valor da hora regular com um acréscimo de 50%. 
		//Escreva umprograma que leia o número de horas trabalhadas em um mês,
		//o saláriopor hora e imprima o salário total do funcionário, que deverá seracrescido das horas extras, 
		//caso tenham sido trabalhadas (considere queo mês possua 4 semanas exatas).
		
		double horastrab = 0;
		double salarioporhora = 0;
		double horaextra = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a qtd de horas trabalhadas no mes: ");
		horastrab = teclado.nextDouble();
		
		System.out.println("Insira o pagamento por hora: ");
		salarioporhora = teclado.nextDouble();
		
		if (horastrab > 160) {
			horaextra = horastrab - 160;			
		}
		
		System.out.println("Horas Trabalhadas: " + horastrab + " Salario por hora: " + salarioporhora + " Horas Extras Trabalhadas(50% bonus por hora): " + horaextra
				+ " Salario do mes: " + String.format("%.2f", (horaextra * (salarioporhora * 1.5) + ((salarioporhora * (horastrab - horaextra))))));
		
		
		teclado.close();
	}

}
