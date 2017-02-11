
public class RecursionNeeded {

	public static void main(String[] args) {
//		for (int i = 1; i >= 0; i--) {
//			for (int j = 1; j >= 0; j--) {
//				for (int k = 1; k >= 0; k--) {
//					for (int n = 1; n >= 0; n--) {
//						System.out.println("" + i + j + k + n);
//					}
//				}
//			}
//		}

//for (int i = 12; i >= 0; i--) {
//	for (int j = 12; j >= 0; j--) {
//		for (int k = 12; k >= 0; k--) {
//			char a = (i < 10) ? (char)('0' + i) : (char)('A' + i - 10);
//			char b = (j < 10) ? (char)('0' + j) : (char)('A' + j - 10);
//			char c = (k < 10) ? (char)('0' + k) : (char)('A' + k - 10);
//			System.out.println("" + a + b + c);
//		}
//	}
//}

		printNums(3, 3);
	}
	
	static void printNums(int base, int depth) {
		printNums(base, depth, "");
	}
	
	static void printNums(int base, int depth, String s) {
		for (int i = base - 1; i >= 0; i--) {
			if (depth == 1) {
				System.out.println(s + i);
			} else {
				s += i;
				printNums(base, depth - 1, s);
				s = s.substring(0, s.length() - 1);
			}
		}
	}
}
