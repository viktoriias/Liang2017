import java.util.Map;
import java.util.TreeMap;

public class StringPermutations {

	public static void main(String[] args) {
//		displayPermutation("abc");
//		System.out.println();
//		displayPermutation("aabc");
		permute("aabc".toCharArray());
	}
	
 // Non-repeating characters
	public static void displayPermutation(String s) {
		displayPermutation("", s);
	}
	
	public static void displayPermutation(String s1, String s2) {
		if (s2.length() < 1) System.out.println(s1);
		for (int i = 0; i < s2.length(); i++) {
			displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
		}
	}
	
	
// Repeating allowed
	public static void permute(char[] input) {
		Map<Character, Integer> countMap = new TreeMap<>();
		for (char ch: input) {
			countMap.compute(ch, (key, val) -> {
				if (val == null)
					return 1;
				else
					return val + 1;
			});
		}
		System.out.println(countMap);
		
		char[] str = new char[countMap.size()];
		int[] count = new int[countMap.size()];
		int index = 0;
		for (Map.Entry<Character, Integer> entry: countMap.entrySet()) {
			str[index] = entry.getKey();
			count[index++] = entry.getValue();
		}
		char[] result = new char[input.length];
		permute(str, count, result, 0);
	}
	
	static void permute(char[] str, int[] count, char[] result, int depth) {
		if (depth == result.length) {
			printArr(result);
			return;
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				result[depth] = str[i];
				count[i]--;
				permute(str, count, result, depth + 1);
				count[i]++;
			}
		}
	}
	
	static void printArr(char[] arr) {
		for (char ch: arr)
			System.out.print(ch);
		System.out.println();
	}
}
