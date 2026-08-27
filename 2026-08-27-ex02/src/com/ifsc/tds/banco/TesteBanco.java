package com.ifsc.tds.banco;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o valor inicial da conta:  ");
		double valor = teclado.nextDouble();
		
		Conta minhaConta = new Conta(valor);
		
		System.out.println("1 para deposito, 2 para saque ");
		int op = teclado.nextInt();
		
		if (op == 1 ) { 
		
		System.out.println("Valor do deposito? ");
		double deposito01 = teclado.nextDouble();
		minhaConta.deposito(deposito01);
		} else {
		System.out.println("Valor do saque? ");
		minhaConta.saque(teclado.nextDouble());
		}
		
	
		
		System.out.println("Saldo da conta R$ " + String.format("%.2f", minhaConta.getSaldo()));
		
		
		
		
				
		
		
		
		

	}

}
