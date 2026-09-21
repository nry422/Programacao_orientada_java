package com.ifsc.tds;

public class ItemBiblioteca {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private double custoAquisicao;
	
	public ItemBiblioteca(String titulo, String autor, int anoPublicacao, double custoAquisicao) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.custoAquisicao = custoAquisicao;	
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public double getCustoAquisicao() {
		return custoAquisicao;
	}

	public void setCustoAquisicao(double custoAquisicao) {
		this.custoAquisicao = custoAquisicao;
	}
	
	
	public void dados() {
		
		System.out.println("Titulo do livro: " + this.titulo);
		System.out.println("Nome do autor: " + this.autor);
		System.out.println("Ano de publicação: "+ this.anoPublicacao);
		System.out.println("Custo de aquisição: R$ " + String.format("%.2f", this.custoAquisicao));
		
		
	}

}
