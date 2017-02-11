import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex21_5 {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "Ex21_4";
		Scanner input = new Scanner(new File("src/" + fileName + ".java"));
		PrintWriter out = new PrintWriter(new File(fileName + ".html"));
		while (input.hasNext()) {
			out.print("<p>");
			String line = input.nextLine();
			Scanner sc2 = new Scanner(line);
			for (int i = 0; line.length() > 0 && (line.charAt(i) == ' ' || line.charAt(i) == '\t'); i++) {
				if (line.charAt(i) == ' ') {
					out.print("&nbsp");
				} else {
					out.print("&emsp;");
				}
			}
			while (sc2.hasNext()) {
				String word = sc2.next();
				if (isKeyWord(word)) {
					out.print("<span style='color: #4286f4'>");
					out.print(word);
					out.print("</span> ");
				} else {
					out.print(word + " ");
				}
			}
			out.println();
		}
		input.close();
		out.close();
	}

	static boolean isKeyWord(String s) {
		Set<String> set = new HashSet<>(Arrays.asList(new String[] {"abstract", "assert", "boolean",
				"break", "byte", "case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else", "enum",
				"extends", "for", "final", "finally", "float", "goto",
				"if", "implements", "import", "instanceof", "int",
				"interface", "long", "native", "new", "package", "private",
				"protected", "public", "return", "short", "static",
				"strictfp", "super", "switch", "synchronized", "this",
				"throw", "throws", "transient", "try", "void", "volatile",
				"while", "true", "false", "null"}));
		if (set.contains(s)) return true;
		return false;
	}
}
