package oo.composicao.desafio;

public class Item {

	int quantidade;
	Produto produto;
	
	Item(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public String toString() {
		return String.format("%3d %10s R$ %7.2f R$ %7.2f",
				this.quantidade,
				this.produto,
				this.produto.preco,
				this.quantidade * this.produto.preco);
	}
}
