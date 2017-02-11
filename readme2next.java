import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readme2next {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("readme.txt"));
		int count = 0;
		while (in.hasNext()) {
			System.out.println(in.next());
			count++;
		}
		System.out.println(count);
	}	

}
