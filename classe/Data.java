package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
		// this.dia = 1;
		// this.mes = 1;
		// this.ano = 1970;
		this(1, 1, 1970); // this() para chamar outro construtor
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia; // this. para acessar membros estáticos (pertencentes à classe)
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada() {
		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
	}
}
