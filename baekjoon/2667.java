import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void bfs(int[][] a, boolean[][] c, int v, int vv, ArrayList<Integer> ans) {
		Queue<Pair> q = new LinkedList<Pair>();
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		q.offer(new Pair(v, vv));
		c[v][vv] = true;
		int hcnt = 1;
		while (!q.isEmpty()) {
			Pair p = q.poll();
			int pv = p.x;
			int pvv = p.y;
			
			for(int i=0; i<4; i++) {
				int xx = pv + dx[i];
				int yy = pvv + dy[i];
				
				if(a[xx][yy] == 1 && c[xx][yy] == false) {
					q.offer(new Pair(xx, yy));
					c[xx][yy] = true;
					hcnt++;
				}
			}
			
//				if (a[pv - 1][pvv] == 1 && c[pv - 1][pvv] == false) {
//					q.offer(new Pair(pv - 1, pvv));
//					c[pv - 1][pvv] = true;
//					hcnt++;
//				}
//				
//				if (a[pv][pvv + 1] == 1 && c[pv][pvv + 1] == false) {
//					q.offer(new Pair(pv, pvv + 1));
//					c[pv][pvv + 1] = true;
//					hcnt++;
//				}
//				
//				if (a[pv + 1][pvv] == 1 && c[pv + 1][pvv] == false) {
//					q.offer(new Pair(pv + 1, pvv));
//					c[pv + 1][pvv] = true;
//					hcnt++;
//				}
//				
//				if (a[pv][pvv - 1] == 1 && c[pv][pvv - 1] == false) {
//					q.offer(new Pair(pv, pvv - 1));
//					c[pv][pvv - 1] = true;
//					hcnt++;
//				}
				
			}
		ans.add(hcnt);
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
		for(int i=0; i<ans.size(); i++) {
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


//1111111
//1111111
//1111111
//1111111
//1111111
//1111111
//1111111
