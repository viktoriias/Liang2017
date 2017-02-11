import java.util.HashMap;
import java.util.Map;

public class DPFib {
	static Map<Integer, Long> map = new HashMap<>();
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Fib: " + fib(45));
		System.out.println("time: " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		map.put(1, (long) 1);
		map.put(2, (long) 1);
		System.out.println("\nDPfib: " + DPfib(45));
		System.out.println("time: " + (System.currentTimeMillis() - start));
	}
	
	static long fib(int n) {
		if (n <= 2) return 1;
		return fib(n - 1) + fib(n - 2);
	}

	static long DPfib(int n) {
		if (map.get(n) != null) return map.get(n);
		long f1 = DPfib(n - 2);
		map.put(n - 2, f1);
		long f2 = DPfib(n - 1);
		map.put(n - 1, f2);
		return f1 + f2;
	}
}
