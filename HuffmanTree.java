import java.io.Serializable;

public class HuffmanTree implements Comparable<HuffmanTree>, Serializable{
	HuffNode root;
	
	HuffmanTree(HuffmanTree t1, HuffmanTree t2) {
		root = new HuffNode();
		root.left = t1.root;
		root.right = t2.root;
		root.weight = t1.root.weight + t2.root.weight;
	}
	
	HuffmanTree(int weight, char ch) {
		root = new HuffNode(weight, ch);
	}
	
	@Override
	public int compareTo(HuffmanTree o) {
		return root.weight - o.root.weight;
	}
	
	@Override
	public String toString() {
		return root.ch + "";
	}
	
	static class HuffNode implements Serializable {
		char ch;
		int weight;
		HuffNode left;
		HuffNode right;
		String code = "";
		
		HuffNode() {}
		HuffNode(int weight, char ch) {
			this.weight = weight;
			this.ch = ch;
		}
	}
}


