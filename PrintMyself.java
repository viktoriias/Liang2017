import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintMyself {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/PrintMyself.java"));
		while (input.hasNext()) {
			System.out.println(input.nextLine());
		}
		input.close();
	}

}
