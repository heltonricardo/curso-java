package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data nasci = new Data();
		Data atual = new Data();
		
		nasci.dia = 13;
		nasci.mes = 1;
		nasci.ano = 1995;
		
		atual.dia = 7;
		atual.mes = 8;
		atual.ano = 2020;
		
		System.out.printf("Data atual: " + atual.dataFormatada());
		System.out.println();
		System.out.printf("Data de nascimento: " + nasci.dataFormatada());
	}
}
