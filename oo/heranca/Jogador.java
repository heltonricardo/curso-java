package oo.heranca;

public class Jogador {

	int x, y;
	int vida = 100;
	
	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);
		
		if (deltaX + deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}
		return false;
	}
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
			case NORTE: --this.y; break;
			case SUL:   ++this.y; break;
			case LESTE: ++this.x; break;
			case OESTE: --this.x; break;
		}
		return true;
	}
}
