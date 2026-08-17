package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Escrever os números ímpares de 1 a 20
		
		double result = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i < 21; i++) {
			
			if (i % 2 != 0 ) {
				result = i;
				System.out.println(+ result);
			}
			
		}

	}

}
