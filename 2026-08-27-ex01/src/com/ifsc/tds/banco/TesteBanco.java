package com.ifsc.tds.banco;



public class TesteBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		double valor;
		Conta minhaConta = new Conta(500);
		
		minhaConta.deposito(22.50);
		
		minhaConta.saque(150.00);
		
		minhaConta.saque(47.62);
		
	
		
		System.out.println("Saldo da conta R$ " + String.format("%.2f", minhaConta.getSaldo()));
		
		
		
		
				
		
		
		
		

	}

}
