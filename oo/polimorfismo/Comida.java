package oo.polimorfismo;

public class Comida {
	
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
