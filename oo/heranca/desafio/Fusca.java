package oo.heranca.desafio;

public class Fusca extends Carro {
	
	final int delta = 10;
	
	public Fusca() {
		this(80);
	}
	
	public Fusca(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.delta = this.delta;
	}
}
