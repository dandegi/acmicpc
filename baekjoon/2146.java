import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int x, y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {

//	public static final int[] dx = { 0, 0, 1, -1 };
//	public static final int[] dy = { 1, -1, 0, 0 };
//	public static final ArrayList<Integer> list = new ArrayList<>();
	
	public static void numberBfs(int[][] a, boolean[][] c, int x, int y, int num) {
		int n = a.length;
		Queue<Pair> q = new LinkedList<Pair>();
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		q.offer(new Pair(x, y));
		c[x][y] = true;
		a[x][y] = num;

		while (!q.isEmpty()) {
			Pair p = q.poll();
			int xx = p.x;
			int yy = p.y;
			
//			xx = q.peek().x;
//			yy = q.peek().y;
//			q.poll();
			
			for (int i = 0; i < 4; i++) {
				int xxx = xx + dx[i];
				int yyy = yy + dy[i];

				if (0 < xxx && 0 < yyy && xxx < n && yyy < n) {
					if (a[xxx][yyy] == 1 && !c[xxx][yyy]) {
						a[xxx][yyy] = num;
						c[xxx][yyy] = true;
						q.offer(new Pair(xxx, yyy));
					}
				}
			}
		}
	}

	public static void cntBfs(int[][] a, int[][] c, Queue<Pair> q, ArrayList<Integer> list) {
		int n = a.length;
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		while (!q.isEmpty()) {
			Pair p = q.poll();
			int x = p.x;
			int y = p.y;
			
//			x = q.peek().x;
//			y = q.peek().y;
//			q.poll();

			for (int i = 0; i < 4; i++) {
				int xx = x + dx[i];
				int yy = y + dy[i];

				if (0 < xx && 0 < yy && xx < n && yy < n) {
					
					if (a[xx][yy] != a[x][y] && a[xx][yy] != 0) {
						list.add(c[xx][yy] + c[x][y]);
					}

					if (a[xx][yy] == 0) {
						c[xx][yy] = c[x][y] + 1;
						q.offer(new Pair(xx, yy));
						a[xx][yy] = a[x][y];
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] a = new int[n + 1][n + 1];
		boolean[][] c = new boolean[n + 1][n + 1];
		int[][] d = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 1; j <= n; j++) {
				a[i][j] = Integer.parseInt(s[j - 1]);
			}
		}

		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (a[i][j] == 1 && !c[i][j]) {
					numberBfs(a, c, i, j, num++);
				}
			}
		}

		Queue<Pair> q = new LinkedList<Pair>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (a[i][j] != 0) {
					q.offer(new Pair(i, j));
				}
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		cntBfs(a, d, q, list);

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		
//		for(int v : list) {
//			if (min > v) {
//				min = v;
//			}
//		}

		System.out.println(min);
	}
}