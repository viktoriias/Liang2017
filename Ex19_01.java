
public class Ex19_01 {

	public static void main(String[] args) {
		GenerickStack2<String> stack1 = new GenerickStack2<>();
		System.out.println("size before: " + stack1.getSize());
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("LA");
		System.out.println(stack1);
		System.out.println("size after: " + stack1.getSize());
		
		GenerickStack2<Integer> stack2 = new GenerickStack2<>();
		stack2.push(2);
		stack2.push(-9);
		System.out.println("\n" + stack2.peek());
		stack2.push(21);
		System.out.println(stack2.pop());
		stack2.push(29);
		System.out.println(stack2);
		System.out.println("stack2 size: " + stack2.getSize());
		
		GenerickStack2<Integer> stack3 = new GenerickStack2<>();
		for (int i = 0; i < 100; i++)
			stack3.push(i);
		System.out.println("\nstack3 size: " + stack3.getSize());
	}

}

class GenerickStack2<E> {
	private E[] arr = (E[]) new Object[10];
	private int last = -1;
	
	public int getSize() { return last + 1; }
	
	public E peek() { 
		if (last == -1) return null;
		else return (E)arr[last];
	}
	
	public void push(E o) { 
		if (last == arr.length - 1) {
			E[] arr2 = (E[]) new Object[arr.length * 2];
			for (int i = 0; i < arr.length; i++) 
				arr2[i] = arr[i];
			arr = arr2;
		}
		arr[++last] = o;
	}
	
	public E pop() {
		if (last == -1) return null;
		else return (E)arr[last--];
	}
	public boolean isEmpty() { return last == -1; }
	
	@Override
	public String toString() { 
		String s = "stack: ";
		for (int i = 0; i <= last; i++)
			s += arr[i] + ", ";
		return s; }
}