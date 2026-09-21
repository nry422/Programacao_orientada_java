package com.ifsc.tds;

public class NotaServico extends DocumentoFiscal {
	
	private double aliquotaISS;
	
	public NotaServico(int numero, String emissor, double valorBruto, double aliquotaISS) {
		
		super(numero, emissor, valorBruto);
		this.aliquotaISS = aliquotaISS;
		
	}

	public double getAliquotaISS() {
		return aliquotaISS;
	}

	public void setAliquotaISS(double aliquotaISS) {
		this.aliquotaISS = aliquotaISS;
	}
	
	public void dadosNota() {
		super.dados();
		System.out.println("Valor liquido: R$ " + String.format("%.2f", (getValorBruto() * (1- aliquotaISS / 100))));
	}

}
