package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Um cliente de supermercado fez uma compra de 20 itens. Leia o
		//preço de cada item e calcule o total que a pessoa vai pagar.
		
		double preco = 0;
		double soma  = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("Insira o preco" + (i + 1 ) + " de 20");
			preco = teclado.nextDouble();
			
			soma = soma + preco;
			
		}
		
		System.out.println("Total R$" + String.format("%.2f", soma));
		teclado.close();

	}

}
