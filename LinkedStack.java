import java.util.Stack;

public class LinkedStack<E> {
	private Node<E> top = null;
	
	public void push(E e) {
		Node<E> temp = new Node(e);
		temp.next = top;
		top = temp;
	}
	
	public E pop() {
		if (top == null) return null;
		Node<E> temp = top;
		top = top.next;
		return temp.element;
	}
	
	public E peek() {
		if (top == null) return null;
		return top.element;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		Node<E> temp = top;
		while (temp != null) {
			result.append(' ');
			result.append(temp.element);
			result.append(' ');
			temp = temp.next;
		}
		return result.append("]").toString();
	}
	
	private static class Node<E> {
		E element;
		Node<E> next;
		
		Node(E e) {
			element = e;
		}
	}
}
