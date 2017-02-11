
public class Outer {

	static void staticMethosOuter() {}
	void nonstaticMethodOuter() {}

	static class InnerStatic {
		static void staticMethodIS() {}
		
		void nonstaticMethodIS() {}
		
		static class DoubleInner {
			static void mDI() {}
		}
	}
	
	class InnerNonstatic {		
		void nonstaticMethodIN() {}
	}
}
