package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*O imposto de renda de uma pessoa varia segundo umatabela.
		 * Se o salário for menor do que R$ 1.000,00, não há imposto;
		 * Se for entre R$ 1.000,00 e R$ 2.200,00, o imposto é de 13%do valor do salário;
		 * Se for maior do que R$ 2.200,00, o imposto é de 22%;
		 * Faça um algoritmo que dado um valor, em reais, correspondentea um salário, informe o valor que será recebido (total menosimposto).
		 */
		
		double salario = 0;
		double salariocomdesc = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o valor do salario: ");
		salario = teclado.nextDouble();
		
		if (salario > 2200) {
			salariocomdesc = salario - (salario * 0.22);
		} else if (salario > 1000) {
			salariocomdesc = salario - (salario * 0.13);
		} else {
			salariocomdesc = salario;
		}
		
		System.out.println("Total com desconto de impostos:" +salariocomdesc);
		teclado.close();
		
			
		

	}

}
