package com.ifsc.tds;

import java.util.ArrayList;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
		
		Cachorro dog = new Cachorro();
		listaAnimais.add(dog);
		
		Animal dog2 = new Cachorro();
		listaAnimais.add(dog2);
		
		Gato cat = new Gato();
		listaAnimais.add(cat);
		
		Animal cat2 = new Gato();
		listaAnimais.add(cat2);
		
		for (int i = 0; i < listaAnimais.size(); i++) {
			Animal umAnimal = listaAnimais.get(i);
			
			if(umAnimal instanceof Gato) {
				Gato umGato = (Gato) umAnimal;
				umGato.emitirSom();				
			} else if (umAnimal instanceof Cachorro) {
				Cachorro umCachorro = (Cachorro) umAnimal;
				umCachorro.emitirSom();
				
			}
			umAnimal.emitirSom();
		}
		
		

	}

}
