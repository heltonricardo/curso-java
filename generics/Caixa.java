package generics;

public class Caixa<T> {

	// O Generic é sempre todo em maiúsculas, ex: TIPO
	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
