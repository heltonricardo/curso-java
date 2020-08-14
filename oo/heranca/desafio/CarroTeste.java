package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro fusca = new Fusca();
		Carro laFerrari = new LaFerrari();
		
		System.out.println("Fusca:     " + fusca.velocidadeAtual + " km/h.");
		System.out.println("LaFerrari: " + laFerrari.velocidadeAtual + " km/h.");
		System.out.println();
		
		for (int i = 0; i < 6; i++) {			
			fusca.acelerar();
			laFerrari.acelerar();
		}
		
		System.out.println("Fusca:     " + fusca.velocidadeAtual + " km/h.");
		System.out.println("LaFerrari: " + laFerrari.velocidadeAtual + " km/h.");
		System.out.println();
		
		fusca.acelerar();
		laFerrari.acelerar();
		
		System.out.println("Fusca:     " + fusca.velocidadeAtual + " km/h.");
		System.out.println("LaFerrari: " + laFerrari.velocidadeAtual + " km/h.");
		System.out.println();
		
		for (int i = 0; i < 10; i++) {			
			fusca.frear();
			laFerrari.frear();
		}
		
		System.out.println("Fusca:     " + fusca.velocidadeAtual + " km/h.");
		System.out.println("LaFerrari: " + laFerrari.velocidadeAtual + " km/h.");
		System.out.println();
	}
}
