import java.io.*;

public class TestObjectStreamForArray {

	public static void main(String[] args) throws ClassNotFoundException, IOException{
		int[] numbers = {1, 2, 3, 4, 5};
		String[] strings = {"John", "Susan", "Kim"};
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("array.dat", true)); ) {
			out.writeObject(numbers);
			out.writeObject(strings);
		}
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("array.dat")); ) {
			int[] newNumbers = (int[])(in.readObject());
			String[] newStrings = (String[])(in.readObject());
			
			for (int i = 0; i < newNumbers.length; i++)
				System.out.print(newNumbers[i] + " ");
			System.out.println();
			
			for (int i = 0; i < newStrings.length; i++)
				System.out.print(newStrings[i] + " ");
 		}
	}

}
