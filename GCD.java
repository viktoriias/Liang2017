
public class GCD {

	public static void main(String[] args) {
		System.out.println(gcd(25, 125));
		System.out.println(gcd(4, 64, 444));
		System.out.println(gcd(new int[] {4, 56, 34, 58, 38, 44}));

	}

	static int gcd(int n1, int n2) {
		if (n1 % n2 == 0) return n2;
		return gcd(n2, n1 % n2);
	}
		
	static int gcd(int a, int b, int c) {
		return gcd(a, gcd(b, c));
	}
	
	static int gcd(int[] a) {
		int gcd = a[0];
		for (int i= 1; i < a.length; i++) {
			gcd = gcd(a[i], gcd);
		}
		return gcd;
	}
}
