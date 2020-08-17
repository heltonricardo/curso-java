package oo.polimorfismo;

// Classes abstratas n�o podem ser instanciadas
// Podem ter m�todos j� implementados ou n�o

public abstract class Comida {
	
	private double peso;

	public Comida(double peso) {
		this.setPeso(peso);
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		if (peso > 0)
			this.peso = peso;
	}
}
