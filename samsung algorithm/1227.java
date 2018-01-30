import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t=1; t<11; t++) {
			int tnum = Integer.parseInt(br.readLine());
			int[][] a = new int[100][100];
			boolean[][] check = new boolean[100][100];
			Pair start = null;
			for(int i=0; i<a.length; i++) {
				String s = br.readLine();
				for(int j=0; j<a.length; j++) {
					a[i][j] = s.charAt(j)-48;
					if(s.charAt(j)-48 == 2)
						start = new Pair(i, j);
				}
			}
			System.out.println("#"+tnum+" "+bfs(a, check, start));
		}
	}
	
	public static int bfs(int[][] a, boolean[][] check, Pair start) {
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		Queue<Pair> q = new LinkedList<>();
		q.offer(start);
		check[start.x][start.y] = true;
		
		while(!q.isEmpty()) {
			Pair p = q.poll();
			
			for(int i=0; i<4; i++) {
				int x = p.x + dx[i];
				int y = p.y + dy[i];
				if(x<0 || x>99 || y<0 || y>99)
					continue;
				if(a[x][y] == 3)
					return 1;
				if(!check[x][y] && a[x][y]==0) {
					q.offer(new Pair(x, y));
					check[x][y] = true;
				}
			}
		}
		return 0;
	}
}

class Pair {
	int x, y;
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
