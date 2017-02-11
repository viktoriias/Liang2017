import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex30_4 {
	static Integer i = new Integer(0);

	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newFixedThreadPool(1000);
		for (int i = 0; i < 1000; i++)
			exec.execute(new Adder());
		exec.shutdown();
		while (!exec.isTerminated()) {}
		System.out.println(i);
	}	
}

class Adder implements Runnable {
	private int n;

	@Override
	public void run() {
		Ex30_4.i++;
		try {
			Thread.sleep(5);
		} catch (InterruptedException ex) {}
	}
	
}