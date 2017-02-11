import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Ex12_v {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("Lincoln.txt"));	
		int[] alpha = new int[26];
		while (in.hasNext()) {
			String s = in.nextLine();
			s = s.toUpperCase();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					alpha[s.charAt(i) - 'A']++;
			}
		}
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.println("Number of " + ((char)(i + 'A')) + "'s: " + alpha[i]);
		}
	}

}
