package oo.heranca.desafio;

public interface Luxo {

	// Toda função dentro de uma classe abstrata, por padrão é public e abstract
	
	void ligarAR();
	void desligarAR();
	
	default int nivelDoAr() {
		return 1;
	}
}
