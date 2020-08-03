package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia, X";
		
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!");
		
		System.out.println(s);
		
		System.out.println("Heltom".toUpperCase().replace("M", "N"));
		
		
	}
}
