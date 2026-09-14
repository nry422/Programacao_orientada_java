package com.ifsc.tds;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//String cpf;
		String nome;
		double salario;
		int senhagerente;
		int senha;
		boolean gerente = false;
		//Funcionario func01 = new Funcionario();

		Gerente gerent = new Gerente();

		System.out.println("Insira o CPF: ");
		gerent.setCPF(teclado.next());

		System.out.println("Insira o Nome: ");
		nome = teclado.nextLine();

		teclado.nextLine();

		System.out.println("Insira o salario: ");
		salario = teclado.nextDouble();

		//gerent.setCPF(cpf);

		gerent.setNome(nome);

		gerent.setSalario(salario);

		System.out.println("Crie senha do gerente");
		senhagerente = teclado.nextInt();

		gerent.setSenha(senhagerente);

		System.out.println("Digite a senha:");
		senha = teclado.nextInt();

		gerente = gerent.autentica(senha);

		if (gerente == true) {
			System.out.println("COFRE ABERTO");

		}

		teclado.close();

	}

}
