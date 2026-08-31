package com.ifsc.tds;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		/*
		 * Instancie um objeto do tipo Pessoa.  Atribua o seu nome ao atributo nome. 
		 * Atribua a sua idade ao atributo idade.  Chame o método dizerONome  Chame o
		 * método dizerAIdade  Chame o método fazerAniversario  Chame o método
		 * dizerAIdade
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a sua idade:  ");
		int vidade = teclado.nextInt();
		
		teclado.nextLine();

		System.out.println("Digite o seu nome:  ");
		String vnome = teclado.nextLine();

		Pessoa estaPessoa = new Pessoa(vidade, vnome);
		
		estaPessoa.dizerONome();

		estaPessoa.dizerAIdade();

		System.out.println("Quer fazer niver? 1 para sim 0 para não ");
		int op = teclado.nextInt();



		if (op == 1) {

			System.out.println("Parabens!");

			estaPessoa.fazerAniversario();
		}

		estaPessoa.dizerONome();

		estaPessoa.dizerAIdade();
		
		teclado.close();

		

	}

}
