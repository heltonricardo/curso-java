package streams;

public class Figura {

	final int lado1, lado2, lado3;

	public Figura(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %d, %d]", lado1, lado2, lado3);
	}
}
