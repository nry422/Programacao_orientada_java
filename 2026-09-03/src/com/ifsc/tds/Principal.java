package com.ifsc.tds;

public class Principal {

	public static void main(String[] args) {
		//conversoes de tipos
		int x = 10;
		float y = 15.5f;
		byte z = 127;
		String texto = new String();
		
		y = x;
		
		x = (int) y;
		
		System.out.println(x);
		
		x = z;
		
		System.out.println(x);
		
		x= 300;
		
		z = (byte) x;
		
		System.out.println(z);
		
		texto = "10";
		
		x = Integer.parseInt(texto);
		
		System.out.println(x);
		
		texto = String.valueOf(x);
		
		System.out.println(texto);
		
		y = Float.parseFloat(texto);
		System.out.println(y);
		
	

	}

}
