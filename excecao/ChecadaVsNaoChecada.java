package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		// geraErro1(); Pode ser chamada assim, sem tratar
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		// geraErro2(); N�o pode ser chamada sem tratar
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	/*
	
	
	
	
	
	*/
	
	// Exce��o n�o checada / n�o verificada -> tratanto opcional:
	// RuntimeException ou quem herda dela ser� n�o verificado
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro! #1");
	}
	
	// Exce��o checada / verificada -> tratamento obrigat�rio:
	// Deve ser tratada dentro dessa fun��o ou onde � chamada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro! #2");
	}
}
