package com.ifsc.tds;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		char codigo = 0;
		char resposta = 0;

		System.out.println("ROBOT MISSILE");
		System.out.println("");
		System.out.println("TYPE THE CORRECT CODE");
		System.out.println("LETTER (A-Z) TO");
		System.out.println("DEFUSE THE MISSILE");
		System.out.println("YOU HAVE 4 CHANCES");
		System.out.println("");

		codigo = (char) (Math.random() * 26 + 65);

		for (int i = 0; i <= 3; i++) {

			System.out.println("TYPE CODE:");
			resposta = teclado.next().toUpperCase().charAt(0);

			if (codigo == resposta) {
				System.out.println("TICK...FZZZZ...CLICK...");
				System.out.println("YOU DID IT");
				return;

			}
			if (resposta < codigo) {
				System.out.print("LATER");
			} else {
				System.out.print("EARLIER");
			}
			System.out.println(" THAN " + resposta);

		}

		System.out.println();
		System.out.println("BOOOOOOOOMMM...");
		System.out.println("YOU BLEW IT.");
		System.out.println("THE CORRECT CODE WAS " + codigo);

	}

}
