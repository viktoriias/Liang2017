
public class PerformanceComp {

	public static void main(String[] args) {
		String[] arr = new String[100000];
		for (int i = 0; i < arr.length; i++)
			arr[i] = "aaa";
		
		long start = System.currentTimeMillis();
		
		String result = "";
		for (String s: arr)
			result += s;
		
//		StringBuilder sb = new StringBuilder();
//		for (String s: arr)
//			sb.append(s);
		
		System.out.println(System.currentTimeMillis() - start);
	}

}
