import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12_2 {

	public static void main(String[] args) {
		boolean go = true;
		System.out.print("Enter two integers: ");
		Scanner input = new Scanner(System.in);
		int a, b;
		while (go) {
			try {
				a = input.nextInt();
				b = input.nextInt();
				System.out.println("Sum: " + (a + b));
				go = false;
			} catch (InputMismatchException e) {
				System.out.print("Two integers please, try again: ");
				input.nextLine();
			} 
		}
	}

}
