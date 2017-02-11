
public class DecToBin {

	public static void main(String[] args) {
		int n = 8;
		StringBuilder sb = new StringBuilder();
		while (n >= 1) {
			sb.insert(0, n % 2);
			n /= 2;
		}
		System.out.println(sb);
	}

}
