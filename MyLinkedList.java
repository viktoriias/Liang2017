
public class MyLinkedList<E> {
	private int size;
	private Node<E> head, tail;
	
	MyLinkedList() {}
	
	public int getSize() {
		return size;
	}

	public E getFirst() {
		if (size == 0) return null;
		return head.element;
	}

	public E getLast() {
		if (size == 0) return null;
		return tail.element;
	}

	public void addFirst(E e) {
		Node<E> newNode = new Node<>(e);
		newNode.next = head;
		head = newNode;
		size++;
		if (tail == null) tail = head;
	}
	
	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);
		if (tail == null) 
			head = tail = newNode;
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void add(int index, E e) {
		if (index == 0) addFirst(e);
		else if (index >= size) addLast(e);
		else {
			Node<E> current = head;
			for (int i = 1; i < index; i++)
				current = current.next;
			Node<E> temp = current.next;
			current.next = temp;
			current.next.next = temp;
			size++;
		}
	}
	
	public E removeFirst() {
		if (size == 0) return null;
		Node<E> temp = head;
		head = head.next;
		size--;
		if (head == null) tail = null;
		return temp.element;
	}
	
	public E removeLast() {
		if (size == 0) return null;
		if (size == 1) {
			Node<E> temp = tail;
			head = tail = null;
			size = 0;
			return temp.element;
		}
		Node<E> current = head;
		for (int i = 0; i < size - 2; i++)
			current = current.next;
		Node<E> temp = tail;
		tail = current;
		tail.next = null;
		size--;
		return temp.element;
	}
	
	public E remove(int index) {
		if (index < 0 || index >= size) return null;
		if (index == 0) return removeFirst();
		if (index == size - 1) return removeLast();
	
		Node<E> previous = head;
		for (int i = 1; i < size - 2; i++)
			previous = previous.next;
		Node<E> current = previous.next;
		previous.next = current.next;
		size--;
		return current.element;
	}
	
	public void clear() {
		size = 0;
		head = tail = null;
	}
	
	@Override
	public String toString() {
//		if (size == 0) return "[]";
		StringBuilder sb = new StringBuilder("[");
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			sb.append(current.element);
			current = current.next;
			if (current.next != null)
				sb.append(", ");
			else sb.append("]");
		}
		return sb.toString();
	}
	
	// HW
	public boolean contains(E e) {
		return true;
	}
	
	public E get(int index) {
		return null;
	}
	
	public int indexOf(E e) {
		return 0;
	}
	
	public E set(int index, E e) {
		return null;
	}
	
	private static class Node<E> {
		E element;
		Node<E> next;
		
		Node(E e) {
			element = e;
		}
	}
}

