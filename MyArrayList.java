
public class MyArrayList<E> {
	private Object[] arr = new Object[10];
	private int len = 0;
	
	public MyArrayList() {}
	
	public int size() { return len + 1; }
	
	public void add(E o) {
		// if len == arr.length create new arr double the size, coppy all the elements
		arr[len++] = o;
	}
	
	public E get(int index) {
		return (E) arr[index];
	}
}
