package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Integer> print = System.out::println; 
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		nums.stream().
			map(DesafioUtil.binString).
			map(DesafioUtil.inverter).
			map(DesafioUtil.strBinary).
			forEach(print);
	}
}
