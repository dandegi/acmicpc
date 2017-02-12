import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	static StringBuilder sb = new StringBuilder();

	public static void bfs(int[][] a, boolean[][] c, int x, int y, int px, int py) {
		Queue<Pair> q = new LinkedList<Pair>();
		int ans = 0;
		int[] dx = { -1, -2, -2, -1, 1, 2, 2, 1 };
		int[] dy = { -2, -1, 1, 2, 2, 1, -1, -2 };
		
		q.offer(new Pair(x, y));
		c[x][y] = true;

		out1: while (!q.isEmpty()) {
			int xx = q.peek().x;
			int yy = q.peek().y;
			q.poll();

			for (int i = 0; i < 8; i++) {
				int xxx = xx + dx[i];
				int yyy = yy + dy[i];
				int size = a.length;
				
				if (xxx < size && yyy < size && xxx >= 0 && yyy >= 0) {
					
					if (!c[xxx][yyy]) {
						
						a[xxx][yyy] = a[xx][yy] + 1;
						c[xxx][yyy] = true;
						q.offer(new Pair(xxx, yyy));

						if (xxx == px && yyy == py) {
							ans = a[xxx][yyy];
							break out1;
						}
						
					}
				}
			}
		}
		
		sb.append(ans).append("\n");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] a = new int[n][n];
			boolean[][] c = new boolean[n][n];

			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);

			s = br.readLine().split(" ");
			int xx = Integer.parseInt(s[0]);
			int yy = Integer.parseInt(s[1]);

			if (x == xx && y == yy) {
				sb.append(0).append("\n");
				continue;
			}
			
			bfs(a, c, x, y, xx, yy);
		}
		
		System.out.print(sb);
	}
}
