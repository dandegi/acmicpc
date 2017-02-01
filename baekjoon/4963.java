import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void bfs(int[][] a, boolean[][] c, int x, int y) {
		Queue<Pair> q = new LinkedList<Pair>();

		int[] dx = { -1, 0, 1, 0, -1, -1, 1, 1 };
		int[] dy = { 0, 1, 0, -1, -1, 1, 1, -1 };
		q.offer(new Pair(x, y));
		c[x][y] = true;
		
		while (!q.isEmpty()) {
			Pair p = q.poll();
			int px = p.x;
			int py = p.y;

			for (int i = 0; i < 8; i++) {
				int xx = px + dx[i];
				int yy = py + dy[i];

				if (a[xx][yy] == 1 && c[xx][yy] == false) {
					q.offer(new Pair(xx, yy));
					c[xx][yy] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int cnt = 0;
			String[] s = br.readLine().split(" ");
			int w = Integer.parseInt(s[0]);
			int h = Integer.parseInt(s[1]);

			if (w == 0 && h == 0) {
				break;
			}

			int[][] a = new int[52][52];
			boolean[][] c = new boolean[52][52];

			for (int i = 1; i <= h; i++) {
				String[] ss = br.readLine().split(" ");
				for (int j = 1; j <= w; j++) {
					a[i][j] = Integer.parseInt(ss[j - 1]);
				}
			}

			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (c[i][j] == false && a[i][j] == 1) {
						bfs(a, c, i, j);
						cnt++;
					}
				}
			}

			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}

}

class Pair {
	int x, y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
