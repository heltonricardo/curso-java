package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	
	void acelerar() {
		this.velocidadeAtual = Math.min(this.velocidadeAtual + 5, 150);
	}
	
	void frear() {
		this.velocidadeAtual = Math.max(this.velocidadeAtual - 5, 0);
	}
}
