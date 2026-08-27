package com.ifsc.tds.banco;

public class Conta { //nome da classe
	
	private double saldo; //atributo
	
	public Conta(double valor) {
		saldo = valor;
	} //construtor
	
	public double getSaldo() {
		return saldo;
	} //metodos
	
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	public void saque(double valor) {
		saldo = saldo - valor;
	}
	
}
