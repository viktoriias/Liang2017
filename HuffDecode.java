import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HuffDecode {
	// 110100111110001010 - Welcome
	// 100011110111101011010- Mississippi

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream fromFile = new ObjectInputStream(new FileInputStream("huff.out"));
		HuffmanTree tree = (HuffmanTree)fromFile.readObject();
		String code = fromFile.readUTF();
		int i = 0;
		while (i < code.length()) {
			HuffmanTree.HuffNode root = tree.root;
			while (root.left != null) {
				if (code.charAt(i) == '0') 
					root = root.left;
				else
					root = root.right;
				i++;
			}
			System.out.print(root.ch);
		}
		fromFile.close();
	}
}
