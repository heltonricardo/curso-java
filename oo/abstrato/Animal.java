package oo.abstrato;

public abstract class Animal {

	// Método final não pode ser sobreescrito por sub-classes
	public final String respirar() {
		return "Usando oxigênio";
	}
	
	public abstract String mover();
}
