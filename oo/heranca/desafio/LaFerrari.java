package oo.heranca.desafio;

public class LaFerrari extends Carro {
	
	final int delta = 80;
	
	LaFerrari() {
		this(150);
	}
	
	LaFerrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.delta = this.delta;
	}
}
