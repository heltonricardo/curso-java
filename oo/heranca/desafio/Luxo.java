package oo.heranca.desafio;

public interface Luxo {

	// Toda fun��o dentro de uma classe abstrata, por padr�o � public e abstract
	
	void ligarAR();
	void desligarAR();
	
	default int nivelDoAr() {
		return 1;
	}
}
