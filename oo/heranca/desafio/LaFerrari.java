package oo.heranca.desafio;

public class LaFerrari extends Carro {
	
	final int delta = 80;
	
	public LaFerrari() {
		this(150);
	}
	
	public LaFerrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.delta = this.delta;
	}
}
