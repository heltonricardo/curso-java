package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		// geraErro1(); Pode ser chamada assim, sem tratar
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		// geraErro2(); Não pode ser chamada sem tratar
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	/*
	
	Exception
	|
	|--- RuntimeException
	|    |
	|    (Não Checadas)
	|
	(Checadas)
	
	*/
	
	// Exceção não checada / não verificada -> tratanto opcional:
	// RuntimeException ou quem herda dela será não verificado
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro! #1");
	}
	
	// Exceção checada / verificada -> tratamento obrigatório:
	// Deve ser tratada dentro dessa função ou onde é chamada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro! #2");
	}
	
	// As checadas devem ser tratadas no método que as cria ou no método que \
	// as chama. Se nao for tratada em nenhum dos dois casos, o método que \
	// chama deve também ter em sua assinatura que lançará uma exceção.
	
	static void geraErro3() throws Exception{
		geraErro2();
	}
}
