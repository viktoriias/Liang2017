import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		String in = "a-b+c";
//		while (true) { 
		//	in = input.nextLine();
			for (int i = 0; i < in.length(); i++) {
				char ch = in.charAt(i);
				if (Character.isLetterOrDigit(ch)) {
					System.out.print(ch);
				} else {
					if (ch == ')') {
						char ch2 = st.pop();
						while (ch2 != '(') {
							System.out.print(ch2);
							ch2 = st.pop();
						}
					} else {
						while (!st.isEmpty()) {
							char ch2 = st.peek();
							if (prec(ch) < prec(ch2) && ch2 != '(')
								System.out.print(st.pop());
							else break;
						}
						st.push(ch);
					}
				}
			}
			while (!st.isEmpty()) {
				System.out.print(st.pop());
			}
//		}
	}
	
	static int prec(char ch) {
		switch (ch) {
			case '+': return 1;
			case '-': return 2;
			case '*': return 3;
			case '/': return 4;
			case '^': return 5;
			case '(': return 6;
		}
		return 0;
	}
}
