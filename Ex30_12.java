import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
public class Ex30_12 {
	static int[] arr; 

	public static void main(String[] args) {
		final int N = 9_000_000;
		arr = new int[N];
		long start = System.currentTimeMillis();
		ArrayInit initTask = new ArrayInit(arr);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(initTask);
		System.out.println("Parallel Time with " + Runtime.getRuntime().availableProcessors() + 
				" Processors " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) 
			arr[i] = random.nextInt();
		System.out.println("Sequential Time: " + (System.currentTimeMillis() - start));
	}

	private static class ArrayInit extends RecursiveAction {
		private int[] arr;
		ArrayInit(int[] arr) {
			this.arr = arr;
		}
		
		@Override
		protected void compute() {
			Random random = new Random();
			if (arr.length < 9_000_000) {
				for (int i = 0; i < arr.length; i++)
					arr[i] = random.nextInt();
			} else {
				int [] firstHalf = new int[arr.length / 2];
				System.arraycopy(arr, 0, firstHalf, 0, arr.length / 2);
				int [] secondHalf = new int[arr.length - arr.length / 2];
				System.arraycopy(arr, arr.length / 2, secondHalf, 0, arr.length - arr.length / 2);
				invokeAll(new ArrayInit(firstHalf), new ArrayInit(secondHalf));				
				System.arraycopy(firstHalf, 0, arr, 0, firstHalf.length);
				System.arraycopy(secondHalf, 0, arr, firstHalf.length, secondHalf.length);
			}
		}
	}
}
