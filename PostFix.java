import java.util.*;

public class PostFix {
	static Stack<Integer> stack;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		stack = new Stack<>();
		String exp = "42*63/+";//"12+3*";//input.nextLine();
		
		if (! exp.matches("^[-+/*\\d]*$")) System.out.println("not a valid regexp");
		else {
			int i = 0;
			while (i < exp.length()) {
				char ch = exp.charAt(i);
				if (Character.isDigit(ch))
					stack.push(Character.digit(ch, 10));
				else stack.push(eval(ch));
				i++;
			}
		
		}
		System.out.println(stack.pop());
		input.close();
	}

	static int eval(char ch) {
		int result = 0;
		int b = stack.pop();
		int a = stack.pop();
		switch (ch) {
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		}
		return result;
	}
}
