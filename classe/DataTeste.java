package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data nasci = new Data(13, 1, 1995);
		Data atual = new Data();
		
		atual.dia = 7;
		atual.mes = 8;
		atual.ano = 2020;
		
		System.out.printf("Data atual: " + atual.dataFormatada());
		System.out.println();
		System.out.printf("Data de nascimento: " + nasci.dataFormatada());
	}
}
