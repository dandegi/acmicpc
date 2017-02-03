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

	public static void bfs(int[][] a, boolean[][] c, int n, int m, int[][] ans) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.offer(new Pair(n,m));
		c[n][m] = true;
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		
		while (!q.isEmpty()) {
			Pair p = q.poll();
			int xn = p.x;
			int ym = p.y;
			
			for(int i=0; i<4; i++) {
				int xx = xn + dx[i];
				int yy = ym + dy[i];
				if(a[xx][yy] == 1 && c[xx][yy] == false) {
					q.offer(new Pair(xx, yy));
					c[xx][yy] = true;
					ans[xx][yy] += ans[xn][ym];
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		int[][] a = new int[102][102];
		boolean[][] c = new boolean[102][102];
		int [][] ans = new int[102][102];
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=m; j++) {
				ans[i][j] = 1;
			}
		}
		
		for(int i=1; i<=n; i++) {
			String[] ss = br.readLine().split("");
			for(int j=1; j<=m; j++) {
				a[i][j] = Integer.parseInt(ss[j-1]);
			}
		}
		bfs(a, c, 1, 1, ans);
		System.out.println(ans[n][m]);
	}
}
