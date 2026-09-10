package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner teclado = new Scanner(System.in);
		String nome;
		String cidade;
		double saldo;
		Conta itau = new Conta();
		Cliente fulano = new Cliente();
		Cidade suaCidade = new Cidade();
		
		System.out.println("Digite o nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Digite a cidade: ");
		cidade = teclado.nextLine();
		
		System.out.println("Digite o saldo: ");
		saldo = teclado.nextDouble();
		
		
		
		
		
		fulano.setNome(nome);
		suaCidade.setNome(cidade);
		fulano.setCidade(suaCidade);
		itau.setCliente(fulano);
		itau.setSaldo(saldo);
		
			
		
		System.out.println("Cliente: " + itau.getCliente().getNome());
		System.out.println("Cidade do cliente: " + itau.getCliente().getCidade().getNome());
		System.out.println("Saldo: R$ " + String.format("%.2f", itau.getSaldo()));
		
		System.out.println("Digite o Valor de saque");
		itau.sacar(teclado.nextDouble());
		
		System.out.println("Digite o Valor de deposito");
		itau.depositar(teclado.nextDouble());
		
		System.out.println("Cliente: " + itau.getCliente().getNome());
		System.out.println("Cidade do cliente: " + itau.getCliente().getCidade().getNome());
		System.out.println("Saldo: R$ " + String.format("%.2f", itau.getSaldo()));
		
		teclado.close();
		
		}catch (Exception e) {
			System.out.println("Erro geral " + e.getMessage());
			e.printStackTrace();
		} finally {
			
		}
		
		

	}

}
