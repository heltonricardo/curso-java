package fundamentos;

public class ConversaoDeTemperatura {
	public static void main(String[] args) {
		double celsius;
		double fahrenheit = 86;
		final int AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(celsius + " °C");
	}
}
