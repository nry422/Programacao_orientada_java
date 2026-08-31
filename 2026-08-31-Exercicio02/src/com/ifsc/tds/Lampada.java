package com.ifsc.tds;

public class Lampada {
	/*
	 *  Possua os atributos acesa e potencia.
 E os métodos: acender, apagar, informarSituacao e informarPotencia.
 O método acender deve alterar o atributo acesa para true.
 O método apagar deve alterar o atributo acesa para false
 O método informarSituacao deve informar a mensagem “A luz está acesa” casoo atributo acesa seja igual a true e a mensagem “A luz está apagada” caso oatributo acesa seja igual a false
 O método informarPotencia deve escrever a mensagem “A potência da lâmparaé X”, onde X é o valor do atribuito potência
	 */
	private double potencia;// atributo
	private boolean ligada;

	public Lampada(double v1, boolean v2) {
		potencia = v1;
		ligada = v2;
	} // construtor

	public void acender() {
		ligada = true;
	} // metodos
	
	public void apagar() {
		ligada = false;
	} // metodos


	public void informarSituacao() {
		if (ligada == true) {
		System.out.println("A lampada esta acesa!");
		} else {
			System.out.println("A lampada esta apagada!");			
		}
		
		
		
	}

	public void informarPotencia() {
		System.out.println("A Potencia da lampada é " + String.format("%.2f", potencia)+ " W");
	}

}
