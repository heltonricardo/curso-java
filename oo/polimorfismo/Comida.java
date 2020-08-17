package oo.polimorfismo;

// Classes abstratas não podem ser instanciadas
// Podem ter métodos já implementados ou não

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
