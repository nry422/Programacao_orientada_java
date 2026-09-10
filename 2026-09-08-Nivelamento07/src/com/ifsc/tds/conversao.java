package com.ifsc.tds;

public class conversao {
	
	public void paraFahrenheit(double temp) {
		//(0 °C × 9/5) + 32
		double fahrenheit = ((temp * 9) / 5) + 32;
		System.out.println("Temperatura convertida = " + String.format("%.2f", fahrenheit));
	}

}
