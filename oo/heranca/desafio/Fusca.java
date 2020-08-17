package oo.heranca.desafio;

public class Fusca extends Carro {
	
	private final int delta = 10;
	
	public Fusca() {
		this(80);
	}
	
	public Fusca(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.setDelta(this.delta);
	}
}
