import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex21_8 {
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> map = new TreeMap<>();
		Scanner in = new Scanner(new File("src/Ex21_6.java"));
		while (in.hasNext()) {
			String line = in.nextLine().toLowerCase();
			String[] words = line.split("[\\s=_.,;:!?(){}\\[\\]/+-<>\"']+");
			for (String s: words) {
				if (map.containsKey(s)) 
					map.put(s, map.get(s) + 1);
				else
					map.put(s, 1);
			}
		}

		for (String s: map.keySet()) {
			if (s.length() > 0)
				System.out.println(map.get(s) + " - " + s);
		}

	}
}
