package com.ifsc.tds;

public class Produto {
	
	private String nome;
	private int estoque;
	private String setor;
	private double valorUnitario;
	
	public Produto(String nome, int estoque, String setor, double valorUnitario) {
		this.nome = nome;
		this.estoque = estoque;
		this.setor = setor;
		this.valorUnitario = valorUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
	public void dados(){
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Estoque: "+ this.estoque);
		System.out.println("Setor: " + this.setor);
		System.out.println("Valor unitario: R$ " + String.format("%.2f", this.valorUnitario));
		
	}

}
