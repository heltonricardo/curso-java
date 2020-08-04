package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na Terça (V ou F)
		// Trabalho na Quinta (V ou F)
		
		boolean terca, quinta, tv50, tv32, sorvete;
		
		terca = false;
		quinta = false;
		tv50 = terca && quinta;
		tv32 = terca ^ quinta;
		sorvete = terca || quinta;
		System.out.println("Trabalho de terça?   " + terca);
		System.out.println("Trabalho de quinta?  " + quinta);
		System.out.println("Compra da Tv de 50\"? " + tv50);
		System.out.println("Compra da Tv de 32\"? " + tv32);
		System.out.println("Sorvete no shopping? " + sorvete);
		System.out.println("Está mais saudável?  " + !sorvete);
		System.out.println();

		terca = false;
		quinta = true;
		tv50 = terca && quinta;
		tv32 = terca ^ quinta;
		sorvete = terca || quinta;
		System.out.println("Trabalho de terça?   " + terca);
		System.out.println("Trabalho de quinta?  " + quinta);
		System.out.println("Compra da Tv de 50\"? " + tv50);
		System.out.println("Compra da Tv de 32\"? " + tv32);
		System.out.println("Sorvete no shopping? " + sorvete);
		System.out.println("Está mais saudável?  " + !sorvete);
		System.out.println();

		terca = true;
		quinta = false;
		tv50 = terca && quinta;
		tv32 = terca ^ quinta;
		sorvete = terca || quinta;
		System.out.println("Trabalho de terça?   " + terca);
		System.out.println("Trabalho de quinta?  " + quinta);
		System.out.println("Compra da Tv de 50\"? " + tv50);
		System.out.println("Compra da Tv de 32\"? " + tv32);
		System.out.println("Sorvete no shopping? " + sorvete);
		System.out.println("Está mais saudável?  " + !sorvete);
		System.out.println();

		terca = true;
		quinta = true;
		tv50 = terca && quinta;
		tv32 = terca ^ quinta;
		sorvete = terca || quinta;
		System.out.println("Trabalho de terça?   " + terca);
		System.out.println("Trabalho de quinta?  " + quinta);
		System.out.println("Compra da Tv de 50\"? " + tv50);
		System.out.println("Compra da Tv de 32\"? " + tv32);
		System.out.println("Sorvete no shopping? " + sorvete);
		System.out.println("Está mais saudável?  " + !sorvete);
		System.out.println();
	}
}
