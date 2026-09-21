package com.ifsc.tds;

public class DocumentoFiscal {
	
	private int numero;
	private String emissor;
	private double valorBruto;
	
	public DocumentoFiscal(int numero, String emissor, double valorBruto) {
		
		this.numero = numero;
		this.emissor = emissor;
		this.valorBruto = valorBruto;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	
	public void dados() {
		System.out.println("Numero da nota: " + this.numero);
		System.out.println("Emissor da nota: " + this.emissor);
	}

}
