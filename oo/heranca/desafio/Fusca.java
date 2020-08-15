package oo.heranca.desafio;

public class Fusca extends Carro {
	
	final int delta = 10;
	
	Fusca() {
		this(80);
	}
	
	Fusca(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.delta = this.delta;
	}
}
