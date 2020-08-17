package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Fusca;
import oo.heranca.desafio.LaFerrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro fusca = new Fusca(100);
		Carro laFerrari = new LaFerrari();
		
		System.out.println("Fusca:     " + fusca + " km/h.");
		System.out.println("LaFerrari: " + laFerrari + " km/h.");
		System.out.println();
		
		fusca.acelerar();
		laFerrari.acelerar();
	
		System.out.println("Fusca:     " + fusca + " km/h.");
		System.out.println("LaFerrari: " + laFerrari + " km/h.");
		System.out.println();
		
		fusca.acelerar();
		laFerrari.acelerar();
		
		System.out.println("Fusca:     " + fusca + " km/h.");
		System.out.println("LaFerrari: " + laFerrari + " km/h.");
		System.out.println();
		
		fusca.frear();
		laFerrari.frear();
		
		System.out.println("Fusca:     " + fusca + " km/h.");
		System.out.println("LaFerrari: " + laFerrari + " km/h.");
		System.out.println();

		fusca.frear();
		laFerrari.frear();
		
		System.out.println("Fusca:     " + fusca + " km/h.");
		System.out.println("LaFerrari: " + laFerrari + " km/h.");
		System.out.println();
	}
}
