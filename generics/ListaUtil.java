package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	// <Tipos gen�ricos que vou usar no m�todo> Tipo gen�rico de retorno
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste;
		
		teste = null;
		
		return teste;
	}
}
