import java.util.ArrayList;
import java.util.List;

public class BoxTester {

	public static void main(String[] args) {
//		List<Box> boxes = new ArrayList<>();
//		GMethodsTester.<Integer>m(5);
		B b = new B();
		b.mI();
	}

}

class Box {
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	private Object obj;
}

interface I {
	void mI();
}
class A implements I {

	@Override
	public void mI() {
		System.out.println("a");
	}
}

class B extends A {
	@Override
	public void mI() {
		System.out.println("b");
	}
	
}
