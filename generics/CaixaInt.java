package generics;

public class CaixaInt extends Caixa<Integer> {
	// Também é possível não resolver o tipo genérico na primeira herança \
	// criando dessa forma: public class CaixaInt<X> extends Caixa<X>
}
