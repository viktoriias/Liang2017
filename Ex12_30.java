import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ex12_30 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		Scanner in = new Scanner(new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt").openStream());	
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
