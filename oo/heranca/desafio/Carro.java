package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		this.velocidadeAtual = Math.min(this.velocidadeAtual + delta, VELOCIDADE_MAXIMA);
	}
	
	void frear() {
		this.velocidadeAtual = Math.max(this.velocidadeAtual - delta, 0);
	}
}
