package com.ifsc.tds;

public class Animal {
	
	private String nome;
	private float comprimento;
	private int nPatas;
	private String cor;
	private String ambiente;
	private float velMedia;
	
	public Animal(String nome, float comprimento, int nPatas, String cor, String ambiente, float velMedia) {
		
		this.nome = nome;
		this.comprimento = comprimento;
		this.nPatas = nPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velMedia = velMedia;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getnPatas() {
		return nPatas;
	}

	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelMedia() {
		return velMedia;
	}

	public void setVelMedia(float velMedia) {
		this.velMedia = velMedia;
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Comprimento: " + String.format("%.2f", comprimento));
		System.out.println("Numero de patas: " + nPatas);
		System.out.println("Cor: " + cor);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Velocidade media: " + this.velMedia);
	}
	

}
