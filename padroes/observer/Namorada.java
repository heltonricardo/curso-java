package padroes.observer;

public class Namorada implements ObservadorChegadaAniverssariante {

	@Override
	public void chegou(EventoChegadaAniverssariante evento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("E... Surpresa!!!");
	}
}
