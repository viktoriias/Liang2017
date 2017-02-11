import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileStreams {

	public static void main(String[] args) throws IOException {
//		try (FileOutputStream out = new FileOutputStream("temp.dat")) {
//			for (int i = 0; i < 10; i++)
//				out.write(i);
//		}
//		
//		try (FileInputStream in = new FileInputStream("temp.dat")) {
//			int val;
//			while ((val = in.read()) != -1)
//				System.out.println(val);
//		}
		
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("temp.dat"))) {
			out.writeUTF("ABC");
		}

//		try (FileInputStream in = new FileInputStream("temp.dat")) {
//		int val;
//		while ((val = in.read()) != -1)
//			System.out.println(val);
//	}
		
		try (DataInputStream in = new DataInputStream(new FileInputStream("temp.dat"))) {
			String s;
			while (in.available() != 0) {
				System.out.println(in.readUTF());
			}
		}
	}

}
