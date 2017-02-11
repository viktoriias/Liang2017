import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Comparing {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "AAA", 4.6));
		list.add(new Student(2, "BBB", 4.9));
		list.add(new Student(3, "AAA", 5.0));
		list.add(new Student(4, "CCC", 3.5));
		list.add(new Student(5, "AAA", 2.1));
		System.out.println("Unsorted list:\t\t" + list);
		Collections.sort(list, new StudentComparatorByName());
		System.out.println("\nSorted by name:\t\t" + list);
		Collections.sort(list, new StudentComparatorByScore());
		System.out.println("\nSorted by score:\t" + list);
		Collections.sort(list, new StudentComparatorByNameScore());
		System.out.println("\nSorted by name-score:\t" + list);
		
		PriorityQueue<Student> pq = new PriorityQueue<>(10, new StudentComparatorByName());
		pq.offer(new Student(1, "AAA", 4.6));		
		pq.offer(new Student(2, "BBB", 4.9));
		pq.offer(new Student(3, "AAA", 5.0));
		pq.offer(new Student(4, "CCC", 3.5));
		pq.offer(new Student(5, "AAA", 2.1));
		while (!pq.isEmpty())
			System.out.println(pq.poll());
	}
	
	public static class StudentComparatorByName implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.lastName.compareTo(o2.lastName);
		}
		
	}
	
	public static class StudentComparatorByScore implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return (int)((o1.score - o2.score) * 100);
		}
		
	}
	
	public static class StudentComparatorByNameScore implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			int result = o1.lastName.compareTo(o2.lastName);
			if (result == 0) {
				if (o1.score < o2.score)
					return -1;
				else if (o2.score == o1.score)
					return 0;
				else return 1;
			}
			return result;
		}
		
	}

}

class Student {
	int id;
	String lastName;
	double score;
	
	Student(int id, String lastName, double score) {
		this.id = id;
		this.lastName = lastName;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return id + "-" + lastName + "-" + score;
	}
}