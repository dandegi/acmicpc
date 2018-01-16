import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int k=1; k<=t; k++) {
			int n = Integer.parseInt(br.readLine());
			int[][] map = new int[n][n];
			boolean[][] check = new boolean[n][n];
			int[][] ans = new int[n][n];
			
			for(int i=0; i<n; i++) {
				String s = br.readLine();
				for(int j=0; j<n; j++) {
					map[i][j] = s.charAt(j) - 48;
					ans[i][j] = Integer.MAX_VALUE;
				}
			}
			
			
			bfs(map, check, 0, 0, ans, n);
			System.out.println("#" + k + " " +ans[n-1][n-1]);
			
		}
		
	}
	
	public static void bfs(int[][] map, boolean[][] check, int n, int m, int[][] ans, int size) {
		Queue<Pair> q = new LinkedList<>();
		q.offer(new Pair(n, m));
		check[n][m] = true;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		ans[0][0] = map[0][0];
		
		while(!q.isEmpty()) {
			Pair p = q.poll();
			int xn = p.x;
			int ym = p.y;
			
			if(xn == n-1 && ym == n-1) {
				break;
			}
			
			for(int i=0; i<4; i++) {
				int xx = xn + dx[i];
				int yy = ym + dy[i];
				if(xx < 0 || xx > size-1 || yy < 0 || yy > size-1)
					continue;
				
				if(ans[xx][yy] > ans[xn][ym] + map[xx][yy]) {
					q.offer(new Pair(xx, yy));
					check[xx][yy] = true;
					ans[xx][yy] = ans[xn][ym] + map[xx][yy];
				} 
					
			}
		}
	}
}

class Pair {
	int x;
	int y;
	
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}