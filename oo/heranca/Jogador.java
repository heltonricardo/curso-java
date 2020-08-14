package oo.heranca;

public class Jogador {

	int x, y;
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
			case NORTE:
				--this.y;
				break;
			case SUL:
				++this.y;
				break;
			case LESTE:
				++this.x;
				break;
			case OESTE:
				--this.x;
				break;
		}
		return true;
	}
}
