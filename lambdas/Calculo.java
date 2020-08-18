package lambdas;

// A anotação FunctionalInterface serve para garantir que uma \
// interface, que será usada com lambda, terá apenas uma função

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
}
