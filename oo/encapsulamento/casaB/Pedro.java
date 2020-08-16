package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	// N�o � necess�rio criar uma inst�ncia, pois os atributos foram herdados
	
	void testeAcessos() {
		// System.out.println(segredo);          -> Erro
		// System.out.println(facoDentroDeCasa); -> Erro
		System.out.println(formaDeFalar); // N�o � poss�vel acessar new Ana().formaDeFalar
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
	}
}
