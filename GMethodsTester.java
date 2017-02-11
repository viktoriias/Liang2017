
public class GMethodsTester {

	public static void main(String[] args) {
		m("aaa");

	}

	static<E> void m(E e) {
		System.out.println(e);
	}
}
