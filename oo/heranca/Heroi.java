package oo.heranca;

public class Heroi extends Jogador {
	
	public Heroi(int x, int y) {
		super(x, y);
	}

	public boolean atacar(Jogador oponente) {
		boolean atq1 = super.atacar(oponente);
		boolean atq2 = super.atacar(oponente);
		boolean atq3 = super.atacar(oponente);
		return atq1 || atq2 || atq3;
	}
}
