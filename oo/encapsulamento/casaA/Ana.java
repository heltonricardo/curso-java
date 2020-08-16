package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = "...";        // privado
	String facoDentroDeCasa = "...";       // padrão/pacote
	protected String formaDeFalar = "..."; // protegido - transmite por herança
	public String todosSabem = "...";      // público
}
