package com.ifsc.tds;

public class Filme {
	
	private String titulo;
	private int duracao;
	private String genero;
	
	public Filme(String titulo, int duracao, String genero) {
		
		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void dados() {
		System.out.println("Titulo do filme: " + titulo);
		System.out.println("Duração do filme: " + this.duracao);
		System.out.println("Genero do filme: " + this.genero);
	}

}
