package oo.heranca.desafio;

public class LaFerrari extends Carro implements Esportivo, Luxo {
	
	private boolean turbo = false;
	private boolean ar = false;
	
	public LaFerrari() {
		this(150);
	}
	
	public LaFerrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		turbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		turbo = false;
	}
	
	@Override
	public void ligarAR() {
		ar = true;
	}
	
	@Override
	public void desligarAR() {
		ar = false;
	}
	
	@Override
	public int getDelta() {
		if (turbo && ar) return 30;
		if (!turbo && ar) return 15;
		if (turbo && !ar) return 35;
		else return 20;
	}
}
