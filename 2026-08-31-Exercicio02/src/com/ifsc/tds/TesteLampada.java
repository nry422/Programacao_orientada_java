package com.ifsc.tds;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		/*
		 * Crie também uma classe TesteLampada que tem um método main que realizeas seguintes operações:
 Instancie um objeto do tipo Lampada.
 Chame o método acender.
 Chame o método informarSituacao.
 Chame o método apagar
 Chame o método informarSituacao
 Chame o método informarPotencia
		 */
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a potencia da lampada:  ");
		double vpotencia = teclado.nextDouble();
		
		teclado.nextLine();

		
		boolean vligada = false;

		Lampada estaLampada = new Lampada(vpotencia, vligada);
		
		estaLampada.informarPotencia();
		estaLampada.informarSituacao();

		

		System.out.println("Ligar ou desligar a lampada? (1 Ligar, 2 desligar) ");
		int op = teclado.nextInt();


while ( op != 0 ) {
		if (op == 1) {

			System.out.println("Ligar");

			estaLampada.acender();
		}

		
		
		if (op == 2) {

			System.out.println("apagar");

			estaLampada.apagar();
		}
		
		estaLampada.informarSituacao(); 
		System.out.println("Ligar ou desligar a lampada? (1 Ligar, 2 desligar, 0 parar) ");
		op = teclado.nextInt();
		}



	}

}
