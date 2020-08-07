package classe;

public class Data {

	byte dia;
	byte mes;
	short ano;
	
	String dataFormatada() {
		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
	}
}
