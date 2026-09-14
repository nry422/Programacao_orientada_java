package com.ifsc.tds;

public class Calculos {

	private double[] vetora = new double[7];
	private double soma = 0;
	private double media = 0;
	private double maior = 0;
	private double menor = 0;

	// soma, media, menor e maior

	public Calculos(double[] vetora) {
		this.vetora = vetora;
	}

	public void soma() {

		for (int i = 0; i < vetora.length; i++) {

			this.soma = this.soma + vetora[i];

		}
		System.out.println("Soma dos " + vetora.length + " valores no vetora A é: " + String.format("%.2f", this.soma));
	}

	public void media() {

		this.media = this.soma / vetora.length;

		System.out
				.println("Media dos " + vetora.length + " valores no vetor A é: " + String.format("%.2f", this.media));

	}

	public void maior() {
		
		this.maior = vetora[0];

		for (int i = 0; i < vetora.length; i++) {

			if (vetora[i] > this.maior) {
				this.maior = vetora[i];
			}

		}

		System.out.println(
				"O maior numero entre os " + this.vetora.length + " vetores é: " + String.format("%.2f", this.maior));

	}

	public void menor() {

		this.menor = vetora[0];

		for (int i = 0; i < vetora.length; i++) {

			if (vetora[i] < this.menor) {
				this.menor = vetora[i];
			}

		}

		System.out.println(
				"O menor numero entre os " + this.vetora.length + " vetores é: " + String.format("%.2f", this.menor));

	}

}
