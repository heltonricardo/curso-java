package classe.desafioModulo;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa() {
		this("João", 50);
	}
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	String dados() {
		return this.nome + " tem " + this.peso + " Kg.";
	}
	
	String comer(Comida comida) {
		
		if (comida != null) {
			this.peso += comida.peso;
			return comida.nome;
		}
		
		return "nada";
	}
}
