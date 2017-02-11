import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex17_4 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("text.txt");
		Scanner sc = new Scanner(file1);
		
		File file2 = new File("text.dat");
		DataOutputStream out = new DataOutputStream(new FileOutputStream(file2));
		
		while (sc.hasNext()) {
			out.writeUTF(sc.nextLine());
		}
		sc.close();
		out.close();
		System.out.println("txt file size: " + file1.length());
		System.out.println("dat file size: " + file2.length());	
	}
}
