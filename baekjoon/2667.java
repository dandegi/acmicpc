import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void bfs(int[][] a, boolean[][] c, int x, int y, ArrayList<Integer> ans) {
		Queue<Pair> q = new LinkedList<Pair>();

		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		q.offer(new Pair(x, y));
		c[x][y] = true;
		int home_cnt = 1;
		while (!q.isEmpty()) {
			Pair p = q.poll();
			int px = p.x;
			int py = p.y;

			for (int i = 0; i < 4; i++) {
				int xx = px + dx[i];
				int yy = py + dy[i];

				if (a[xx][yy] == 1 && c[xx][yy] == false) {
					q.offer(new Pair(xx, yy));
					c[xx][yy] = true;
					home_cnt++;
				}
			}
		}
		ans.add(home_cnt);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		int[][] a = new int[27][27];
		boolean[][] c = new boolean[27][27];
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			String s = br.readLine();
			for (int j = 1; j <= n; j++) {
				a[i][j] = s.charAt(j - 1) - 48;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (a[i][j] == 1 && c[i][j] == false) {
					bfs(a, c, i, j, ans);
					cnt++;
				}
			}
		}
		sb.append(cnt).append("\n");
		Collections.sort(ans);
		for (int i = 0; i < ans.size(); i++) {
			sb.append(ans.get(i)).append("\n");
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
// bfs포문을 이프로하면 이렇게 된다.
//if (a[px - 1][py] == 1 && c[px - 1][py] == false) {
//q.offer(new Pair(px - 1, py));
//c[px - 1][py] = true;
//home_cnt++;
//}
//
//if (a[px][py + 1] == 1 && c[px][py + 1] == false) {
//q.offer(new Pair(px, py + 1));
//c[px][py + 1] = true;
//home_cnt++;
//}
//
//if (a[px + 1][py] == 1 && c[px + 1][py] == false) {
//q.offer(new Pair(px + 1, py));
//c[px + 1][py] = true;
//home_cnt++;
//}
//
//if (a[px][py - 1] == 1 && c[px][py - 1] == false) {
//q.offer(new Pair(px, py - 1));
//c[px][py - 1] = true;
//home_cnt++;
//}
