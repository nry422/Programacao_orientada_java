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
		
		do {
		System.out.println("HOW DIFFICULT? (4-10?)");
		dif = teclado.nextInt();
		
		} while (dif < 4 || dif > 10);
		
		for (int i=1; i <= dif; i++) {
			
			ms = ms + (char) (Math.random() * 26 + 65);
			
		}
		
		System.out.println("SEND THIS MESSAGE:");
		
		System.out.println(ms);
		
		Thread.sleep(dif * 333);
		
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
		
		
		System.out.println("TYPE THE MESSAGE:");
		ns = teclado.next().toUpperCase();
		
		if (ns.equals(ms)) {
			
			System.out.println("MESSAGE CORRECT");
			System.out.println("THE WAR IS OVER");
			
		} else {
			System.out.println("YOU GOT IT WRONG");
			System.out.println("YOU SHOULD HAVE SENT:");
			System.out.println(ms);
		}
		
		
		
		teclado.close();
		
		

				
		
		
	 

	}

}
