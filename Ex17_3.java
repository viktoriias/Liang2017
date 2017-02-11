import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex17_3 {

	public static void main(String[] args) throws IOException {
		try (
			DataInputStream in = new DataInputStream(new FileInputStream("100ints.dat"));
		) {
			double sum = 0; 
			int n = 0;
			try {
				while (true) {
					sum += in.readInt();
					n++;
				}
			} catch (EOFException ex) {
			}
			System.out.println(sum / n);
		}

	}

}
