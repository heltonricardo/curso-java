package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		var a = 1;
		var b = 1.1;
		var c = "texto";
		
		a = 2;
		b = 3.2;
//		c = 1; NAO FUNCIONA -> mudança de tipos
		
		System.out.println(a + b + c);
	}
}
