import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ex21_6 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 0) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
			n = in.nextInt();
		}

		for (int i: map.keySet()) {
			if (map.get(i) > 1)
				System.out.println(i + " occurs " + map.get(i) + " times");
		}
	}

}
