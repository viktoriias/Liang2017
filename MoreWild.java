import java.util.ArrayList;

public class MoreWild {

	public static void main(String[] args) {
		ArrayList<A> l1 = new ArrayList<>();
		ArrayList<B> l2 = new ArrayList<>();
		ArrayList<E> l3 = new ArrayList<>();
		ArrayList<C> l4 = new ArrayList<>();
		ArrayList<G> l5 = new ArrayList<>();
		ArrayList<D> l6 = new ArrayList<>();
		
		B b = new B();
		G g = new G();
		
		m1(l3);
		m2(l3);
		m3(l6);
		
		mX(g);
	}

	static void m1(ArrayList<? extends I> list) {}
	static void m2(ArrayList<? extends B> list) {}
	static void m3(ArrayList<? super D> list) {}
	
	static <X extends E> void mX(X x) {}
}

interface I {}
class A {}
class B extends A {}
class C extends A implements I {}
class D extends B {}
class E extends B implements I {}
class F extends E {}
class G extends E {}



