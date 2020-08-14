package oo.heranca.desafio;

public class Fusca extends Carro {

	@Override
	void acelerar() {
		this.velocidadeAtual = Math.min(this.velocidadeAtual + 10, 150);
	}
	
	@Override
	void frear() {
		this.velocidadeAtual = Math.max(this.velocidadeAtual - 10, 0);
	}
}
