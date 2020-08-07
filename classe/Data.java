package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada() {
		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
	}
}
