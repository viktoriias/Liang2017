import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex21_1 {
	public static void main(String[] args) {
		Set <String> set1 = new HashSet<>(Arrays.asList(new String[] {"George",
				"Jim", "John", "Blake", "Kevin", "Michael"}));
		Set <String> set2 = new HashSet<>(Arrays.asList(new String[] {"George",
				"Katie", "Michelle", "Ryan"}));
		
		// union
		Set <String> temp = new HashSet<>(set1);
		temp.addAll(set2);
		System.out.println("temp: " + temp);
		
		// difference
		temp = new HashSet<>(set1);
		temp.removeAll(set2);
		System.out.println("temp: " + temp);
		
		// intersection
		temp = new HashSet<>(set1);
		temp.retainAll(set2);
		System.out.println("temp: " + temp);
	}
}
