package com.ifsc.tds;

public class Perecivel extends Produto {
	
	private String dataValidade;
	
	public Perecivel(String nome, int estoque, String setor, double valorUnitario, String dataValidade) {
		
		super(nome, estoque, setor, valorUnitario);
		
		this.dataValidade = dataValidade;
		
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	public void dadosPerecivel() {
		super.dados();
		System.out.println("Data de validade: " + this.dataValidade);
		
		
	}

}
