package oo.heranca.desafio;

public class Carro {

	private final int VELOCIDADE_MAXIMA;
	private int velocidadeAtual;
	protected int delta = 5;
	
	// O construtor do carro pode ter visibilidade package ou protected
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		this.velocidadeAtual = Math.min(this.velocidadeAtual + delta, VELOCIDADE_MAXIMA);
	}
	
	public void frear() {
		this.velocidadeAtual = Math.max(this.velocidadeAtual - delta, 0);
	}
	
	public String toString() {
		return Integer.toString(velocidadeAtual);
	}
}
