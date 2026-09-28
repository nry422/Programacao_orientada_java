package com.ifsc.tds;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class TesteData {

	public static void main(String[] args) {
		
		Calendar dataInicio = Calendar.getInstance();
		
		dataInicio.set(1988, Calendar.APRIL, 22);
		
		Calendar dataFinal = Calendar.getInstance();
		
		long diferenca = dataFinal.getTimeInMillis() - dataInicio.getTimeInMillis();
		
		int tempoDia = 1000 * 60 * 60 * 24;
		long diasDiferenca = diferenca / tempoDia;
		JOptionPane.showMessageDialog(null, "Diferença de dias: " + diasDiferenca);

	}

}
