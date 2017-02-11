
public class RandomStr {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 1111; i++) {
			sb.append((char)(Math.random() * 94 + 33));
			if (i % 100 == 0) sb.append('\n');
		}
		System.out.println(sb);
	}

}
