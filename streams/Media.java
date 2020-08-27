package streams;

public class Media {

	private double total;
	private int quantidade;
	
	public Media adicionar(double valor) {
		this.total += valor;
		++quantidade;
		return this;
	}
	
	public double getValor( ) {
		return this.total / this.quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {
		return new Media().adicionar(m1.getValor()).adicionar(m2.getValor());
	}
}
