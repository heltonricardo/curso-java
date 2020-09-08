package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	public void adicionar(C chave, V valor) {
		if (chave == null) return;
		
		Par<C, V> novo = new Par<>(chave, valor);
		if (itens.contains(novo))
			itens.remove(novo);
		
		itens.add(novo);
	}
	
	public V getValor(C chave) {
		if (chave == null) return null;
		
		Optional <Par<C, V>> parOpt = 
				itens.stream()
				.filter(par -> chave.equals(par.getChave())).findFirst();
		
		if (parOpt.isPresent())
			return parOpt.get().getValor();
		
		return null;
	}
}
