
public class WildCardDemo {

	public static void main(String[] args) {
		GenerickStack<Integer> intStack = new GenerickStack<>();
		intStack.push(1);
		intStack.push(33);
		intStack.push(-8);
		System.out.println("The max number is " + max(intStack));
		
		GenerickStack<Number> numStack = new GenerickStack<>();
		m2(numStack);
		m2(intStack);
	}

	
	static double max(GenerickStack<? extends Number> stack) {
		double max = stack.pop().doubleValue();
		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (value > max) max = value;
		}
		return max;
	}
	
	static void m2(GenerickStack<? super Integer> stack) {
		
	}
}
