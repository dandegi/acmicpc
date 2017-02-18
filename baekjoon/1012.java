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
	
	public static void bfs(int[][] a, boolean[][] c, int x, int y, int m, int n) {
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		Queue<Pair> q = new LinkedList<Pair>();
		
		q.offer(new Pair(x, y));
		c[x][y] = true;
		
		while(!q.isEmpty()) {
			int xx = q.peek().x;
			int yy = q.peek().y;
			q.poll();
			
			for(int i=0; i<4; i++) {
				int xxx = xx + dx[i];
				int yyy = yy + dy[i];
				
				if(xxx>=0 && yyy>=0 && xxx<m && yyy<n) {
					
					if(a[xxx][yyy]==1 && !c[xxx][yyy]) {
						q.offer(new Pair(xxx, yyy));
						c[xxx][yyy] = true;
					}
					
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			int cnt = 0;
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			int k = Integer.parseInt(s[2]);
			
			int[][] a = new int[m][n];
			boolean[][] c = new boolean[m][n];
			
			for(int i=0; i<k; i++) {
				s = br.readLine().split(" ");
				a[Integer.parseInt(s[1])][Integer.parseInt(s[0])] = 1;
			}
			
			for(int i=0; i<m; i++) {
				
				for(int j=0; j<n; j++) {
					
					if(a[i][j] == 1 && !c[i][j]) {
						bfs(a, c, i, j, m, n);
						cnt++;
					}
					
				}
			}
			sb.append(cnt).append("\n");
		}
		
		System.out.print(sb);
		
	}
}