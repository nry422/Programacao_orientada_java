package com.ifsc.tds;

import java.util.Scanner;

public class Vital {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int dif = 0;
		String ms = "";
		String ns = "";
		
		System.out.println("VITAL MESSAGE");
		System.out.println(" ");
		System.out.println("HOW DIFFICULT? (4-10?");
		dif = teclado.nextInt();
		
		for (int i=1; i <= dif; i++) {
			
			ms = ms + (char) (Math.random() * 26 + 65);
			
		}
		
		System.out.println(ms);
		
		Thread.sleep(1000);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.println("Insira a mensagem: ");
		ns = teclado.next();
		
		if (ns.equals(ms)) {
			
			System.out.println("MESSAGE CORRECT");
			System.out.println("THE WAR IS OVER");
			
		} else {
			System.out.println("YOU GOT IT WRONG");
			System.out.println("YOU SHOULD HAVE SENT");
			System.out.println(ms);
		}
		
		
		teclado.close();
		
		

				
		
		
	 

	}

}
