package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends Exception {

	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return "Atributo negativo: " + this.nomeDoAtributo;
	}
}
