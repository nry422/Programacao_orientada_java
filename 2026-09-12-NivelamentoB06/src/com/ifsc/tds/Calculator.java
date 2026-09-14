package com.ifsc.tds;

public class Calculator {
	
	public void resultado(int numero) {
		
		int resultado = 0;
		
		for (int i = 0; i <= numero; i++) {
			resultado = resultado + i;
		}
		
		System.out.println("Resultado da soma dos numeros entre 1 e " + numero + " é: " + resultado);
		
	}

}
