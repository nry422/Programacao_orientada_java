package com.ifsc.tds;

public class Livro extends ItemBiblioteca {
	
	private int numeroPaginas;
	
	public Livro(String titulo, String autor, int anoPublicacao, double custoAquisicao, int numeroPaginas){
	
	super(titulo, autor, anoPublicacao, custoAquisicao);
	
	this.numeroPaginas = numeroPaginas;
	
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public void dadosLivro() {
		
		super.dados();
		System.out.println("Numero de paginas: " + this.numeroPaginas);
	}
	
	

}
