package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer n = 10000;
		System.out.println(n.toString().length());
		
		int m = 123456;
		System.out.println(Integer.toString(m).length());
	}
}
