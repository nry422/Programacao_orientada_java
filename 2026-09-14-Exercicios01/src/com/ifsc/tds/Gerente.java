package com.ifsc.tds;

public class Gerente extends Funcionario {

	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int valorSenha) {

		if (this.getSenha() == valorSenha) {
			System.out.println("Autenticado!");
			return true;
		} else {
			System.out.println("Não autenticado!");
			return false;
		}

	}

}
