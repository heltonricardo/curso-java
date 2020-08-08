package classe.desafioModulo;

public class Comida {

	String nome;
	double peso;
	
	Comida() {
		this("Arroz", 0.1);
	}
	
	Comida(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
}
