package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double d = 1; // Conversão implícita (int para double)
		float f = (float) 1.1; // conversão explícita, cast (double p/ float)
		
		int c = 4;
		byte b = (byte) c;
	}
}
