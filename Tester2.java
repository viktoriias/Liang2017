import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester2 {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("ttt.tst"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {}

	}

}
