package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto() {
		
	}
	
	Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	double precoComDesconto() {
		return this.preco * (1 - this.desconto);
	}
	
	double precoComDesconto(double desconto) {
		return this.preco * (1 - this.desconto + desconto);
	}
}
