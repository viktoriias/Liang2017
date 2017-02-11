import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex21_2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("data.txt"));
		Set<String> set = new TreeSet<>();
		Set<String> set2 = new TreeSet<>(Collections.reverseOrder());
		while (input.hasNext()) {
			String word = input.next();
			set.add(word);
			set2.add(word);
		}
		System.out.println(set);
		System.out.println(set2);
	}
}
