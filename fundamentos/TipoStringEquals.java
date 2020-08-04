package fundamentos;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		String s1 = "2";
		String s2 = new String("2");
		
		System.out.println("2" == "2");
		System.out.println(s1 == "2");
		System.out.println(s2 == "2");
		
		System.out.println();
		
		System.out.println("2".equals("2"));
		System.out.println(s1.equals("2"));
		System.out.println(s2.equals("2"));
	}
}
