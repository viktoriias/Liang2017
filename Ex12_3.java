import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12_3 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter index [0 - 100]: ");
		try {
			int index = input.nextInt();
			System.out.println("arr[" + index + "] = " + arr[index]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("That's outside our limits");
		} catch (InputMismatchException e) {
			System.out.println("I asked for a number, didn't I?");
		}

	}

}
