import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex17_2 {

	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("100ints.dat"));
		for (int i = 0; i < 100; i++) {
			int x = (int)(Math.random() * 100);
			out.writeInt(x);
		}
		out.close();
	}

}
