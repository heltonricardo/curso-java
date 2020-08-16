package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	// Não é necessário criar uma instância, pois os atributos foram herdados
	
	void testeAcessos() {
		// System.out.println(segredo);          -> Erro
		// System.out.println(facoDentroDeCasa); -> Erro
		System.out.println(formaDeFalar); // Não é possível acessar new Ana().formaDeFalar
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
	}
}
