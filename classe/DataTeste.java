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
		
		System.out.printf("Data atual: %02d/%02d/%04d", atual.dia, atual.mes, atual.ano);
		System.out.println();
		System.out.printf("Data de nascimento: %02d/%02d/%04d", nasci.dia, nasci.mes, nasci.ano);
	}
}
