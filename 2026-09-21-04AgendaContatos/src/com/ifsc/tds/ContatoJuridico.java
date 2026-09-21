package com.ifsc.tds;

public class ContatoJuridico extends Contato {
	
	private String cnpj;
	private String razaoSocial;
	
	public ContatoJuridico(String nome, String telefone, String cnpj, String razaoSocial) {
		
		super(nome, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	public void dadosJuridicos() {
		
		super.dados();
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Razao Social: "+ this.razaoSocial);
		
	}

}
