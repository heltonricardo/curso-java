package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a; // Atribuição por valor (tipo primitido)
		
		System.out.printf("A: %d e B: %d\n", a, b);
		++a;
		--b;
		System.out.printf("A: %d e B: %d\n\n", a, b);
		
		Data d1 = new Data(8, 8, 2020);
		Data d2 = d1; // Atribuição por referência (objeto)
		
		System.out.println("D1: " + d1.dataFormatada());
		System.out.println("D2: " + d2.dataFormatada());
		System.out.println();
		
		d1.dia = 30;
		d2.ano = 1970;
		System.out.println("D1: " + d1.dataFormatada());
		System.out.println("D2: " + d2.dataFormatada());
		System.out.println();
		
		dataPadrao(d1);
		System.out.println("D1: " + d1.dataFormatada());
		System.out.println("D2: " + d2.dataFormatada());
	}
	
	static void dataPadrao(Data d) {
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
