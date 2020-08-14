package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi j1 = new Heroi();
		// Ou: Jogador j2 = new Heroi();
		j1.x = 10;
		j1.y = 10;

		Jogador j2 = new Monstro();
		// Ou: Monstro j1 = new Monstro();
		j2.x = 11;
		j2.y = 11;
		
		System.out.println("Heroi:   " + j1.x + " " + j1.y + " " + j1.vida);
		System.out.println("Monstro: " + j2.x + " " + j2.y + " " + j2.vida);
		System.out.println();
		
		System.out.println("Herói ataca Monstro: " + j1.atacar(j2));
		System.out.println("Heroi:   " + j1.x + " " + j1.y + " " + j1.vida);
		System.out.println("Monstro: " + j2.x + " " + j2.y + " " + j2.vida);
		System.out.println();
				
		System.out.println("Herói anda para SUL: " + j1.andar(Direcao.SUL));
		System.out.println("Heroi:   " + j1.x + " " + j1.y + " " + j1.vida);
		System.out.println("Monstro: " + j2.x + " " + j2.y + " " + j2.vida);
		System.out.println();
		
		System.out.println("Herói ataca Monstro: " + j1.atacar(j2));
		System.out.println("Heroi:   " + j1.x + " " + j1.y + " " + j1.vida);
		System.out.println("Monstro: " + j2.x + " " + j2.y + " " + j2.vida);
		System.out.println();
		
	}
}
