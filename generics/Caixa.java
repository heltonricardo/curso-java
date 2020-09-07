package generics;

public class Caixa<T> {

	// O Generic � sempre todo em mai�sculas, ex: TIPO
	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
