package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	public int delta = 5;
	
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		this.velocidadeAtual = Math.min(this.velocidadeAtual + delta, VELOCIDADE_MAXIMA);
	}
	
	public void frear() {
		this.velocidadeAtual = Math.max(this.velocidadeAtual - delta, 0);
	}
}
