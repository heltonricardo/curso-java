package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> lista = new ArrayList<Item>();
	
	double obterValorTotal() {
		double soma = 0;
		for (Item item: lista)
			soma += item.quantidade * item.produto.preco;
		return soma;
	}

	void adicionarItem(Item item) {
		this.lista.add(item);
	}
	
	void exibir() {
		for (Item item: lista)
			System.out.println(item);
		
	}
}
