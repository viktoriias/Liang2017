import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Ex12_12 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("dualpal.java"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal1.java")));
		while (f.ready()) {
			String st = f.readLine();
			int pos = st.indexOf("{");
			if (pos == -1) 
				out.println(st);
			else {
				out.println(st.substring(0, pos));
				int spaces = 0;
				while (st.charAt(spaces) == ' ') spaces++;
				for (int i = 0; i < spaces; i++)
					out.print(' ');
				int tabs = 0;
				while (st.charAt(tabs) == '\t') tabs++;
				for (int i = 0; i < tabs; i++)
					out.print('\t');
				
				out.println(st.substring(pos));
			}
		}
		f.close();
		out.close();

	}

}
