package com.ifsc.tds;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		/*
		 * Crie também uma classe TesteFuncionario que tem um método main que realize
		 * asseguintes operações:  Atribua o valor “Fulano” ao atributo nome  Atribua
		 * o valor “Ciclano” ao atributo sobrenome  Atribua o valor 10 ao atributo
		 * horasTrabalhadas  Atribua o valor 25.50 ao atributo valorPorHora  Chame o
		 * método nomeCompleto.  Chame o método calcularSalario.  Adicione 8 ao
		 * atributo horasTrabalhadas utilizando o método incrementarHoras  Chame
		 * novamente o método calcularSalario.  Obs: talvez seja necessário criar
		 * alguns métodos e ou atributos para terminar o exercício, além dosdescritos
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome:  ");
		String vnome = teclado.nextLine();

		

		System.out.println("Digite o sobrenome:  ");
		String vsobrenome = teclado.nextLine();

		

		System.out.println("Digite as horas trabalhadas:  ");
		double vhorastra = teclado.nextDouble();

		System.out.println("Digite o salario por hora:  ");
		double vpaghora = teclado.nextDouble();

		Funcionario esteFuncionario = new Funcionario(vnome, vsobrenome, vhorastra, vpaghora);

		esteFuncionario.nomeCompleto();

		esteFuncionario.calcularSalario();

		System.out.println("valor de horas extras? 0 se não tiver");
		double horaextra = teclado.nextDouble();
		
		if (horaextra != 0) {

		esteFuncionario.incrementarHora(horaextra);

		esteFuncionario.nomeCompleto();

		esteFuncionario.calcularSalario();}

	}

}
