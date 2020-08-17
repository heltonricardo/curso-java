package oo.abstrato;

public abstract class Animal {

	// M�todo final n�o pode ser sobreescrito por sub-classes
	public final String respirar() {
		return "Usando oxig�nio";
	}
	
	public abstract String mover();
}
