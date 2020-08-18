package lambdas;

// A anota��o FunctionalInterface serve para garantir que uma \
// interface, que ser� usada com lambda, ter� apenas uma fun��o

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
}
