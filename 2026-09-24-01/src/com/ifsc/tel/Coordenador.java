package com.ifsc.tel;

import com.ifsc.tds.Pessoa;

public class Coordenador extends Pessoa {
	
	private double tempoCoordenacao;

	public double getTempoCoordenacao() {
		return tempoCoordenacao;
	}

	public void setTempoCoordenacao(double tempoCoordenacao) {
		this.tempoCoordenacao = tempoCoordenacao;
	}
	
	public void imprimirDados() {
		System.out.println(this.codigo);
	}

}
