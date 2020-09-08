package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniverssariante> observadores = new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniverssariante obs) {
		observadores.add(obs);
	}
	
	public void monitorar() {
		Scanner e = new Scanner(System.in);
		String valor;
		
		do {
			System.out.print("Aniversariante chegou? [sim/qualquercoisa/sair]: ");
			valor = e.nextLine();
			
			if (valor.equalsIgnoreCase("sim"))
				observadores.stream()
					.forEach(o -> o.chegou(new EventoChegadaAniverssariante(new Date())));
			else System.out.println("Alarme falso!");
			
		} while (!valor.equalsIgnoreCase("sair"));
		
		e.close();
	}
}
