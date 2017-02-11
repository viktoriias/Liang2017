
public class Queens {
	static int N = 8;
	static boolean[][] board = new boolean[N][N];
	
	public static void main(String[] args) {
		solve();
		displayBoard(board);
	}
	
	static void solve() {
		solve(0);
	}
	
	static boolean solve(int row) {
		if (row == N) return true;

		for (int col = 0; col < N; col++) {
			if (isOk(row, col)) {
				board[row][col] = true;
				if (solve(row + 1)) return true;
				board[row][col] = false;
			}	
		}
		return false;
	}
	
	static boolean isOk(int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] && j == y) return false;
				if (board[i][j] && (Math.abs(x - i) == Math.abs(y - j))) return false;
			}
		}
		return true;
	}

	static void displayBoard(boolean[][] b) {
		for (boolean[] i: b) {
			for (boolean j: i) {
				System.out.print(j ? " Q" : " _");
			}
			System.out.println();
		}
	}
}
