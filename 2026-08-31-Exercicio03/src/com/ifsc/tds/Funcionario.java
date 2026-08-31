package com.ifsc.tds;

public class Funcionario {
/*
 *  Crie uma classe FuncionarioConforme o dia grama a seguir.
 A classe possui os atributos nome, sobrenome, horasTrabalhadas e valorPorHora.  O método nomeCompleto deve escrever na tela o atributo nome concatenado aoatributo sobrenome
 O método calcularSalario faz o cálculo de quanto o funcionário irá receber no mês,
multiplicando o atributo horasTrabalhadas pelo atributo valorPorHora. Em seguida,
escreve o valor na tela.
 O método incrementarHoras adiciona um valor passado por parâmetro ao valor jáexistente no atributo horasTrabalhadas.
 */

private String nome;// atributo
private String sobrenome;
private double horasTrabalhadas;
private double valorPorHora;


public Funcionario(String v1, String v2, double v3, double v4) {
	nome = v1;
	sobrenome = v2;
	horasTrabalhadas = v3;
	valorPorHora = v4;
} // construtor

public void nomeCompleto() {
	System.out.println(nome + sobrenome);
} // metodos

public void calcularSalario() {
	double total = horasTrabalhadas * valorPorHora;
	System.out.println("Total a receber = " + String.format("%.2f", total));
} // metodos


public void incrementarHora(double addhora) {
	horasTrabalhadas = horasTrabalhadas + addhora;	
	
}
}

