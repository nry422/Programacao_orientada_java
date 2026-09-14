package com.ifsc.tds;

public class Imprimir {
	
	public void imprime(int[][] matriz) {
		
		System.out.println("Sua matriz 2x4 é:");

		for (int linha = 0; linha < 2; linha++) {

			for (int coluna = 0; coluna < 4; coluna++) {				
				System.out.print(matriz[linha][coluna] + " ");
			}

			
			System.out.println();
		}

		
	}

}
