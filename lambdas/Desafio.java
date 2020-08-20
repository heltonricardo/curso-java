package lambdas;

import java.util.function.UnaryOperator;
import java.util.function.Function;


public class Desafio {

	public static void main(String[] args) {
		
		Function<Produto, Double> precoReal = p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> imposto = i -> i >= 2500 ? i * 1.085 : i;
		UnaryOperator<Double> frete = f -> f >= 3000 ? f + 100 : f + 50;
		UnaryOperator<Double> arredondar = a -> Double.parseDouble(String.format("%.2f", a).replace(',',  '.'));
		Function<Double, String> formatar = f -> "R$ " + f.toString().replace('.', ',');
		
		Produto prod = new Produto("iPad", 3235.89, 0.13);
		
		String r = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(prod);
		
		System.out.println("Valor final: " + r);
	}
}
