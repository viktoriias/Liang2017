
public class InnerOuterTester {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.nonstaticMethodOuter();
		Outer.staticMethosOuter();
		Outer.InnerStatic.DoubleInner.mDI();
		
		
		Outer.InnerStatic innerStatic = new Outer.InnerStatic();
		Outer.InnerStatic.staticMethodIS();
		innerStatic.nonstaticMethodIS();
		
		Outer.InnerNonstatic innerNonstatic = outer.new InnerNonstatic();
		innerNonstatic.nonstaticMethodIN();
	}
}
