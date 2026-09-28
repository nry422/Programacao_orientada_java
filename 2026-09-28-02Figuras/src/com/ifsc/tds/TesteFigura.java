package com.ifsc.tds;

public class TesteFigura {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		
		Triangulo triangulo = new Triangulo();
		
		quadrado.setLado(2);
		System.out.println(quadrado.getArea());
		
		triangulo.setAltura(4);
		triangulo.setBase(6);
		triangulo.setLadoA(5);
		triangulo.setLadoB(5);
		triangulo.setLadoC(6);
		
		System.out.println(triangulo.getArea());

	}

}
