package com.ifsc.tds;

public class Pessoa {
	/*
	 *  Possua os atributos nome e idade.  Possua um método construtor para
	 * informar o nome e a idade.  E os métodos: dizerONome, dizerAIdade e
	 * fazerAniversario.  O método dizerONome deve escrever na tela a mensagem:
	 * “Olá, meu nome é”, e o valor do atributo nome.  O método dizerAIdade deve
	 * escrever na tela a mensagem: “Olá, eu tenho Xanos”, onde X é o valor do
	 * atributo idade.  O método fazerAniversario deve adicionar 1 à idade da
	 * Pessoa.
	 */

	// nome da classe

	private String nome;// atributo
	private int idade;

	public Pessoa(int v1, String v2) {
		this.idade = v1;
		this.nome = v2;
	} // construtor

	public void dizerONome() {
		System.out.println("Olá, meu nome é " + this.nome);
	} // metodos

	public void dizerAIdade() {
		System.out.println("Olá, eu tenho " + this.idade + " anos");
	}

	public void fazerAniversario() {
		this.idade = this.idade + 1;
	}

}
