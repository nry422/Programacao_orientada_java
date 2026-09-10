package com.ifsc.tds;

public class Conta {
	
	private double saldo;
	
	private Cliente cliente;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(double value) {
		this.saldo = this.saldo + value;
	}
	
	

}
