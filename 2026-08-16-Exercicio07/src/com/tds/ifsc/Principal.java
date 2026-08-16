package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia,
		//e R$ 1,00 se forem compradas pelo menos 12 unidades. Escreva umprograma que leia
		//o número de maçãs compradas, calcule e imprima ocusto total da compra.
		
		int qtdmacas = 0;
		double precoapagar = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de maças: ");
		qtdmacas = teclado.nextInt();		
		
		
		if (qtdmacas < 12) {
			precoapagar = 1.30;
		} 		

	 else { 
		precoapagar = 1.00;
	}
	
	System.out.println("Quantidade: " + qtdmacas + " Preço por unidade: " + String.format("%.2f", precoapagar) + " Total a Pagar: " + String.format( "%.2f", (qtdmacas * precoapagar)) );
		teclado.close();
	}

}
