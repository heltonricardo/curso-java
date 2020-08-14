package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi();
		// Ou: Jogador j2 = new Heroi();
		heroi.x = 10;
		heroi.y = 10;

		Jogador monstro = new Monstro();
		// Ou: Monstro j1 = new Monstro();
		monstro.x = 11;
		monstro.y = 11;
		
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();
		
		System.out.println("Her�i ataca Monstro: " + heroi.atacar(monstro));
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();
				
		System.out.println("Her�i anda para SUL: " + heroi.andar(Direcao.SUL));
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();
		
		System.out.println("Her�i ataca Monstro: " + heroi.atacar(monstro));
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();

		System.out.println("Monstro ataca Her�i: " + monstro.atacar(heroi));
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();
		
	}
}
