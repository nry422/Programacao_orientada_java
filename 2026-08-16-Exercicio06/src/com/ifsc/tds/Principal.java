package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// 06 Faça um programa que receba como entrada três valores e os imprima emordem decrescente
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int tempnumero = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o Primeiro Numero: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Insira o Segundo Numero: ");
		numero2 = teclado.nextInt();
		
		System.out.println("Insira o Terceiro Numero: ");
		numero3 = teclado.nextInt();
		
		if (numero1 < numero2) {
			tempnumero = numero1;
			numero1 = numero2;
			numero2 = tempnumero;			
		} 
		
		if (numero2 < numero3) {
			tempnumero = numero2;
			numero2 = numero3;
			numero3 = tempnumero;
		}
		
		if (numero1 < numero2) {
			tempnumero = numero1;
			numero1 = numero2;
			numero2 = tempnumero;			
		} 
		
		
		System.out.println("numeros em ordem desc: " +numero1 +numero2 +numero3);
		teclado.close();

	}

}
