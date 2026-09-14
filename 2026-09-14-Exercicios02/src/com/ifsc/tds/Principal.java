package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Transporte trans01 = new Transporte();
		
		Carro carro01 = new Carro();
		
		trans01.setCapacidade(50000);
		
		Terrestre terrestre01 = new Terrestre();
		
		terrestre01.setCapacidade(20000);
		terrestre01.setnRodas(6);
		
		System.out.println("Cadastre o carro!");
		
		System.out.println("Capacidade de carga:");
		carro01.setCapacidade(teclado.nextDouble());
		
		System.out.println("Insira o numero de rodas:");
		carro01.setnRodas(teclado.nextInt());
		
		System.out.println("Insira a cor: ");
		carro01.setCor(teclado.next());
		
		System.out.println("Insira o numero de portas: ");
		carro01.setnPortas(teclado.nextInt());
		
		System.out.println("Insira a placa: ");
		carro01.setPlaca(teclado.next());
		
		
		System.out.println(" Carro 01: ");
		
		System.out.println("Carga: " + String.format("%.2f", carro01.getCapacidade()));
		
		System.out.println("Numero de rodas: " + carro01.getnRodas());
		
		System.out.println("Cor: " + carro01.getCor());
		
		System.out.println("Numero de portas: " + carro01.getnPortas());
		
		System.out.println("Numero da placa: " + carro01.getPlaca());
		
		System.out.println("Transporte: ");
		
		System.out.println("Carga: " + String.format("%.2f", trans01.getCapacidade()));
		
		System.out.println("Transporte terrestre: ");
		
		System.out.println("Carga: " + String.format("%.2f", terrestre01.getCapacidade()));
		
		System.out.println("Numero de rodas: " + terrestre01.getnRodas());
		
		
		
		
		
		teclado.close();
		
		

	}

}
