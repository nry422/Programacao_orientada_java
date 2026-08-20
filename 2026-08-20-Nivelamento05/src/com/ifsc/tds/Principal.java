package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Leia o nome;
		//Leia o sobrenome;
		//Concatene o nome com o sobrenome;
		//Apresente o nome completo.
		
		String nome = "";
		String sobrenome= "";
		String nomecompleto = "";
		Scanner teclado = new Scanner(System.in);
		Concatenar vamosConcatenar = new Concatenar();
		
		System.out.println("Insira o seu nome: ");
		nome = teclado.next();
		
		System.out.println("Insira o seu sobrenome: ");
		sobrenome = teclado.next();
		
		
		nomecompleto = vamosConcatenar.juntarNomes(nome, sobrenome);
		
		System.out.println("Nome completo: " + nomecompleto);
		
		teclado.close();
		


	}

	
	
	
	
	
	
	


}
