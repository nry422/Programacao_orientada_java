package com.ifsc.tds;

public class Filme3D extends Filme {
	
	private String tecnologiaProjecao;
	private double taxaOculos;
	
	public Filme3D(String titulo, int duracao, String genero, String tecnologiaProjecao, double taxaOculos) {
		
		super(titulo, duracao, genero);
		
		this.tecnologiaProjecao = tecnologiaProjecao;
		this.taxaOculos = taxaOculos;
		
	}

	public String getTecnologiaProjecao() {
		return tecnologiaProjecao;
	}

	public void setTecnologiaProjecao(String tecnologiaProjecao) {
		this.tecnologiaProjecao = tecnologiaProjecao;
	}

	public double getTaxaOculos() {
		return taxaOculos;
	}

	public void setTaxaOculos(double taxaOculos) {
		this.taxaOculos = taxaOculos;
	}
	
	public void exibirRelatorioCompleto() {
			super.dados();
			System.out.println("Tecnologia de projecao: " + this.tecnologiaProjecao);
			System.out.println("Taxa do Oculos: R$ " + String.format("%.2f", this.taxaOculos));
			
			
	}

}
