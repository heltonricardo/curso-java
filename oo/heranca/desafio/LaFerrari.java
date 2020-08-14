package oo.heranca.desafio;

public class LaFerrari extends Carro {

	@Override
	void acelerar() {
		this.velocidadeAtual = Math.min(this.velocidadeAtual + 80, 150);
	}
	
	@Override
	void frear() {
		this.velocidadeAtual = Math.max(this.velocidadeAtual - 80, 0);
	}
}
