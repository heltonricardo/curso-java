package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Teclado", 20.3);
		Produto produto2 = new Produto("Mouse", 10.5);
		Produto produto3 = new Produto("Mesa", 463.8);
		Produto produto4 = new Produto("Computador", 6999.99);

		Item item1 = new Item(2, produto1);
		Item item2 = new Item(3, produto2);
		Item item3 = new Item(1, produto3);
		Item item4 = new Item(1, produto4);
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(item1);
		compra1.adicionarItem(item3);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(item2);
		compra2.adicionarItem(item4);
		
		Cliente cliente = new Cliente("João Pedro");
		cliente.comprar(compra1);
		cliente.comprar(compra2);
		
		System.out.println("Cliente ......: " + cliente.nome);
		System.out.println();
		cliente.exibir();
		System.out.printf("Total gasto ..: R$ %.2f\n", cliente.obterValorTotal());
	}
}
