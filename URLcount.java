import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.Scanner;

public class URLcount {

	public static void main(String[] args) throws IOException {
		File fIn = new File("bla.txt");
		File fOut = new File("bla2.txt");
		Scanner in = new Scanner(fIn);
		PrintWriter out = new PrintWriter(fOut);
		while (in.hasNext()) {
			String s = in.nextLine();
//			System.out.println(s);
			out.print(s);
			out.println('-');
		}
		fIn.delete();
		fOut.renameTo(fIn);
		
		in.close();
		out.close();
	}

}
