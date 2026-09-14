package com.ifsc.tds;

public class Calculadora {

	public void acharPrimos(int inicio, int fim) {

		for (int i = inicio; i <= fim; i++) {

			boolean primo = true;

			if (i == 1 || i == 0) {
				primo = false;
			}

			for (int j = 2; j < i; j++) { // se o numero for 2 nem vai ser testado entao primo fica true

				if (i % j == 0) { // se qualquer numero entre 3 e ele mesmo der resto 0 é divisivel entao é primo
					primo = false;
					break;
				}

			}

			if (primo) {
				System.out.println(i + " e primo!");
			}

		}

	}

}
