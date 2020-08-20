package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		Runnable tr1 = new Trabalho();
		
		Runnable tr2 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++)
					System.out.println("Trabalho #2: " + (i + 1));
			}
		};
		
		Runnable tr3 = () -> {
			for (int i = 0; i < 5; i++)
				System.out.println("Trabalho #3: " + (i + 1));
		};
		
		Runnable tr4 = Threads::trabalho4;
		
		tr1.run();
		System.out.println();
		tr2.run();
		System.out.println();
		tr3.run();
		System.out.println();
		tr4.run();
		System.out.println();
		
		Thread th1 = new Thread(tr1);
		Thread th2 = new Thread(tr2);
		Thread th3 = new Thread(tr3);
		Thread th4 = new Thread(tr4);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
	
	static void trabalho4() {
		for (int i = 0; i < 5; i++)
			System.out.println("Trabalho #4: " + (i + 1));
	}
}
