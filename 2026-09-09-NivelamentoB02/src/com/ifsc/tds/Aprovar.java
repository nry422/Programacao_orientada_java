package com.ifsc.tds;

public class Aprovar {
	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double mediaog;
	private boolean recuperacao;

	public Aprovar(double n1, double n2, double n3, double n4) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.mediaog = (n1 + n2 + n3 + n4) / 4;
		if (this.mediaog >= 7.0) {
			this.recuperacao = true;
		} else {
			this.recuperacao = false;
		}	
		
			
		}
	public void mediaAprova(){
		System.out.println("A Sua média é: " + this.mediaog);
		
	}
	public boolean status() {
		return recuperacao;
	}
	
	public void depoisrecup(double n5) {
		double mediafinal = (n5+this.mediaog) / 2;
		if (mediafinal >= 5) {
			System.out.println("Parabéns Aprovado na recuperação com média: " + String.format("%.2f", mediafinal));
		} else {
			System.out.println("Reprovado!");
		}
	}

	}

