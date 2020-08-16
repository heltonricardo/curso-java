package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
		
	void testeAcessos() {
		// System.out.println(sogra.segredo);         -> Erro
		// System.out.println(sogra.facoDentroDeCasa); -> Erro
		// System.out.println(sogra.formaDeFalar);     -> Erro
		System.out.println(sogra.todosSabem);
	}
}
