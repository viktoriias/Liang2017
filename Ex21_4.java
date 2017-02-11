import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex21_4 {

	public static void main(String[] args) throws FileNotFoundException {
		Set<Character> set = new HashSet<>(Arrays.asList(new Character[] {'A', 'E', 'I', 'O', 'U'}));
		Scanner input = new Scanner(new File("data.txt"));
		int consonants = 0, vowels = 0;
		while (input.hasNext()) {
			String line = input.nextLine().toUpperCase();
			for (int i = 0; i < line.length(); i++) {
				if (Character.isLetter(line.charAt(i))) {
					if (set.contains(line.charAt(i))) vowels++;
					else consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}

}
