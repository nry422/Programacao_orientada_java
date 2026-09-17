package com.ifsc.tds;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Mamifero camelo = new Mamifero("camelo", 150.0f, 4, "amarelo", "terra", 0.0f, "");
		
		Peixe tubarao = new Peixe("Tubarão", 300.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
		
		Mamifero ursocanada = new Mamifero(" Urso-do-canadá", 180.0f, 4, "Vermelho", "Terra", 0.5f, "Mel");
		
		
		camelo.dadosMamifero();
		
		tubarao.dadosPeixe();
		
		ursocanada.dadosMamifero();
		

	}

}
