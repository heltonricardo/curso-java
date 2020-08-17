package oo.heranca.desafio;

public class Carro {

	private final int VELOCIDADE_MAXIMA;
	private int velocidadeAtual;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	// O construtor do carro pode ter visibilidade package ou protected
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		this.velocidadeAtual = Math.min(this.velocidadeAtual + getDelta(), VELOCIDADE_MAXIMA);
	}
	
	public void frear() {
		this.velocidadeAtual = Math.max(this.velocidadeAtual - getDelta(), 0);
	}
	
	public String toString() {
		return Integer.toString(velocidadeAtual);
	}
}
