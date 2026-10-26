package com.peregrinoti.entity;

public class Amigo {

	private Long id;

	private String nome;

	private String nome_responsavel;
	
	private String telefone;
	
	private String endereco;

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNome_responsavel() {
		return nome_responsavel;
	}



	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		return this.nome;
	}
}
