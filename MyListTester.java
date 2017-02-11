import java.util.ArrayList;

public class MyListTester {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(3);
		l.add("o");
		int a = (int)l.get(1);
		System.out.println(l);
		
		MyArrayList<Integer> list = new MyArrayList<>();
		list.add(2);
//		list.add("green");
		int i = list.get(0);
//		int b = (int) list.get(1);
	}
}
