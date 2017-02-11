import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCode {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter text: ");
		String txt = in.nextLine();
		int[] counts = getCharFreq(txt);
//		System.out.printf("%-15s%-15s%-15s\n", "Character", "Frequency", "Code");
		HuffmanTree tree = getHuffmanTree(counts);
		ObjectOutputStream toFile= new ObjectOutputStream(new FileOutputStream("huff.out"));
		toFile.writeObject(tree);
		
		String[] codes = getCode(tree.root);
		String encode = "";
		for (int i = 0; i < txt.length(); i++) {
			encode += codes[txt.charAt(i)];
		}
		System.out.println(encode);
		toFile.writeUTF(encode);
		
//		for (int i = 0; i < codes.length; i++) 
//			if (counts[i] != 0)
//				System.out.printf("%-15s%-15d%-15s\n", (char)i + "", 
//						counts[i], codes[i]);
		in.close();
		toFile.close();
	}

	static int[] getCharFreq(String txt) {
		int[] alpha = new int[256]; // All ASCII
		for (int i = 0; i < txt.length(); i++)
			alpha[(int)txt.charAt(i)]++;
		return alpha;
	}
	
	static HuffmanTree getHuffmanTree(int[] alpha) {
		PriorityQueue<HuffmanTree> pq = new PriorityQueue<>();
		for (int i = 0; i < alpha.length; i++) 
			if (alpha[i] > 0) 
				pq.offer(new HuffmanTree(alpha[i], (char)i));
		
		while (pq.size() > 1) {
			HuffmanTree t1 = pq.poll();
			HuffmanTree t2 = pq.poll();
			pq.add(new HuffmanTree(t1, t2));
		}
		return pq.poll();
	}
	
	static void assignCode(HuffmanTree.HuffNode root, String[] codes) {
		if (root.left != null) {
			root.left.code = root.code + "0";
			assignCode(root.left, codes);
			
			root.right.code = root.code + "1";
			assignCode(root.right, codes);
		} else
			codes[(int)root.ch] = root.code;
	}
	
	static String[] getCode(HuffmanTree.HuffNode root) {
		String[] codes = new String[256];
		assignCode(root, codes);
		return codes;
	}
}
