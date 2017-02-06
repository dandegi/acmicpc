import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

// 여러개의 출발점이 있을수 있으므로 q를 전역으로 선언해서 미리 다 넣은다음에 bfs를 사용한다.
// c배열을 인트형으로 선언해서 몇일만에 익은지 이전 c배열것을 확인해서 +1 한뒤에 c배열에 넣는다.
class Pair {
	int x, y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static Queue<Pair> q = new LinkedList<Pair>();
	public static void bfs(int[][] a, int[][] c) {
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		while (!q.isEmpty()) {
			Pair p = q.poll();
			int xx = p.x;
			int yy = p.y;
			
			for (int i = 0; i < 4; i++) {
				int xxx = xx + dx[i];
				int yyy = yy + dy[i];

				if (a[xxx][yyy] == 0 && c[xxx][yyy] == 0) {
					a[xxx][yyy] = 1;
					c[xxx][yyy] = c[xx][yy] + 1;
					q.offer(new Pair(xxx, yyy));
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);

		int[][] a = new int[1002][1002];
		int[][] c = new int[1002][1002];
		for (int i = 0; i <= m + 1; i++) {
			for (int j = 0; j <= n + 1; j++) {
				a[i][j] = -1;
			}
		}

		for (int i = 1; i <= m; i++) {
			s = br.readLine().split(" ");
			for (int j = 1; j <= n; j++) {
				a[i][j] = Integer.parseInt(s[j - 1]);
			}
		}
		
		int cnt = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (a[i][j] == 1) {
					q.offer(new Pair(i, j));
					c[i][j] = 0;
					cnt++;
				}
			}
		}
		
		bfs(a, c);
		
		if(cnt == n*m) {
			System.out.println(0);
			return;
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				
				if(a[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				
				if(max<c[i][j]) {
					max = c[i][j];
				}
				
			}
		}
		System.out.println(max);
	}
}