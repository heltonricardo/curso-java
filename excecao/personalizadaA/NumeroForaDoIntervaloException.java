package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException {

	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return "Atributo negativo: " + this.nomeDoAtributo;
	}
}
