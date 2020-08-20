package lambdas;

public class Trabalho implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Trabalho #1: " + (i + 1));
	}
}
