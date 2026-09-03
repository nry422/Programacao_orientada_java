package com.ifsc.tds;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int resultado = Principal.divisao(2,0);
		System.out.println(resultado);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}
	
	public static int divisao(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}


