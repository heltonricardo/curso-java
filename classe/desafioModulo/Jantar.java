package classe.desafioModulo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Helton", 75);
		Comida comida1 = new Comida();
		Comida comida2 = new Comida("Feijão", 0.223);
		
		System.out.println(pessoa.dados());
		
		String info = pessoa.comer(comida1);
		System.out.println("Comeu " + info);
		System.out.println(pessoa.dados());
		
		info = pessoa.comer(comida2);
		System.out.println("Comeu " + info);
		System.out.println(pessoa.dados());
	}
}
