package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double d = 1; // Convers�o impl�cita (int para double)
		float f = (float) 1.1; // convers�o expl�cita, cast (double p/ float)
		
		int c = 4;
		byte b = (byte) c;
	}
}
