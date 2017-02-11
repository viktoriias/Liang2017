import java.util.PriorityQueue;

public class KnightsTour {
	static final int N = 9;
	static boolean[][] board = new boolean[N][N];
	static int[][] access = new int[N][N];
	static int x = 4, y = 4;
	static int trackIt = 0;

	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
            if (i == 0 || i == N - 1) access[i][0] = 0;
            else if (i == 1 || i == N - 2) access[i][0] = 1;
            else access[i][0] = 2;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                access[i][j] = access[j][0] + access[i][0];
            }
        }
        
		board[x][y] = true;
		solve();
//		printArr();
	}

	static boolean solve() {
        if (boardFull()) return true;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        try {
            if (!board[x - 2][y - 1])
                    pq.add(new Point(x - 2, y - 1, N));
        } catch (Exception ex) {}
        try {
            if (!board[x - 2][y + 1])
                    pq.add(new Point(x - 2, y + 1, N));
        } catch (Exception ex) {}
        try {
            if (!board[x - 1][y - 2])
                    pq.add(new Point(x - 1, y - 2, N));
        } catch (Exception ex) {}
        try {
            if (!board[x - 1][y + 2])
                    pq.add(new Point(x - 1, y + 2, N));
        } catch (Exception ex) {}
        try {
            if (!board[x + 1][y - 2])
                    pq.add(new Point(x + 1, y - 2, N));
        } catch (Exception ex) {}
        try {
            if (!board[x + 1][y + 2])
                    pq.add(new Point(x + 1, y + 2, N));
        } catch (Exception ex) {}
        try {
            if (!board[x + 2][y - 1])
                    pq.add(new Point(x + 2, y - 1, N));
        } catch (Exception ex) {}
        try {
            if (!board[x + 2][y + 1])
                    pq.add(new Point(x + 2, y + 1, N));
        } catch (Exception ex) {}

        while (!pq.isEmpty()) {
            Point p = pq.poll();
//            grid.getChildren().add(new Line(x * size + size / 2, y * size + size / 2,
//                p.x * size + size / 2, p.y * size + size / 2));
            int tempX = x, tempY = y;
            x = p.x;
            y = p.y;
            board[x][y] = true;
            if (solve()) return true;
            board[x][y] = false;
            x = tempX;
            y = tempY;
//            grid.getChildren().remove(grid.getChildren().size() - 1);
        }
        return false;
    }

    static boolean boardFull() {
        for (boolean[] i: board) {
                for (boolean j: i)
                        if (!j) return false;
        }
        return true;
    }
}

class Point implements Comparable {
    int x, y, N, priority = 0;

    Point(int x, int y, int N) {
        this.x = x;
        this.y = y;
        this.N = N;
        priority = KnightsTour.access[x][y];
    }

    @Override
    public int compareTo(Object o) {
        return priority -  ((Point)o).priority;
    }
}