package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		// Wrappers são versões objeto dos tipos primitivos
		// Os objetos possuem métodos associados
		
		Byte B = 100;
		Short S = 1000;
		Integer I = 100000;
		Long L = 10000000000L;
		Boolean BL = Boolean.parseBoolean("true");
		Character C = '$';
		Float F = 123.0F;
		Double D = 123456789.456321;
		
		System.out.println(BL);
		System.out.println(B.toString());
		
		System.out.println(S + I + L + C + F + D);
	}
}
