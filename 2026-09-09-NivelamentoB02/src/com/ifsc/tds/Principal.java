package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 2 – Faça um programa onde serão informados as quatro notas do aluno. O
		 * programa irá então apresentar a média, se foi aprovado (nota ≥ 7) ou se ficou
		 * em exame. Caso o aluno ficou em exame, o programa irá então perguntar qual
		 * foi a nota do exame e então calculará a nova média (média anterior com a nota
		 * do exame) e informar se ele foi aprovado (nova média ≥ 5) ou se foi
		 * reprovado.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, n3, n4;
		
		System.out.println("Insira a nota 1 ");
		n1 = teclado.nextDouble();
		
		System.out.println("Insira a nota 2 ");
		n2 = teclado.nextDouble();
		
		System.out.println("Insira a nota 3 ");
		n3 = teclado.nextDouble();
		
		System.out.println("Insira a nota 4 ");
		n4 = teclado.nextDouble();
		
		Aprovar testarAprovar = new Aprovar(n1, n2, n3, n4);
		
		testarAprovar.mediaAprova();
		
		boolean aprovado = testarAprovar.status();
		
		if (aprovado == true) {
			System.out.println("Você foi Aprovado!!! ");
		} else {
			System.out.println("Qual foi sua nota na prova de recuperação?");
			double notarecupera = teclado.nextDouble();
			testarAprovar.depoisrecup(notarecupera);
		}

	}

}
