package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double a = Math.pow(6 * (3 + 2), 2) / (3 * 2);
		double b = Math.pow((1 - 5) * (2 - 7) / 2, 2);
		double c = Math.pow(a - b, 3) / Math.pow(10, 3);
		
		System.out.println((int) a);
		System.out.println((int) b);
		System.out.println((int) c);
	}
}
