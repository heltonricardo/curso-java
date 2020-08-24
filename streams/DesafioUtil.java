package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public interface DesafioUtil {
	
	public final static Function<Integer, String> binString = 
			b -> Integer.toBinaryString(b);
			
	public final static UnaryOperator<String> inverter =
			i -> new StringBuilder(i).reverse().toString();
	
	public final static Function<String, Integer> strBinary =
			s -> Integer.parseInt(s, 2);
}
