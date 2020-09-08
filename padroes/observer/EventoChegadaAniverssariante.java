package padroes.observer;

import java.util.Date;

public class EventoChegadaAniverssariante {

	private final Date momento;

	public EventoChegadaAniverssariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
}
