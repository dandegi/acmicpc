import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 10;
		while(t-- > 0) {
			int tnum = Integer.parseInt(br.readLine());
			int[][] ladder = new int[100][100];
			for(int i=0; i<100; i++) {
				String[] s = br.readLine().split(" ");
				for(int j=0; j<100; j++) {
					ladder[i][j] = Integer.parseInt(s[j]);
				}
			}
			
			for(int i=0; i<100; i++) {
				if(ladder[0][i] == 1) {
					boolean[][] check = new boolean[100][100];
					if(bfs(ladder, check, i)) {
						System.out.println("#"+tnum+" "+i);
						break;
					}
				}
			}
		}
		
		
	}
	
	public static boolean bfs(int[][] ladder, boolean[][] check, int start ) {
		Queue<Pair> q = new LinkedList<>();
		boolean ans = false;
		int[] dx = {0, 0, 1};
		int[] dy = {1, -1, 0};
		q.offer(new Pair(0, start));
		check[0][start] = true;
		
		while(!q.isEmpty()) {
			Pair p = q.poll();
			
			for(int i=0; i<3; i++) {
				int x = p.x + dx[i];
				int y = p.y + dy[i];
				if(x>=100 || x<0 || y>=100 || y<0) {
					continue;
				}
				if(ladder[x][y] == 2) {
					ans = true;
					break;
				}
				if(ladder[x][y] == 1 && !check[x][y] && i==0) {
					q.offer(new Pair(x, y));
					check[x][y] = true;
					break;
				} else if(ladder[x][y] == 1 && !check[x][y] && i==2) {
					q.offer(new Pair(x, y));
					check[x][y] = true;
					break;
				} else if(ladder[x][y] == 1 && !check[x][y]) {
					q.offer(new Pair(x,y));
					check[x][y] = true;
					break;
				}
			}
		}
		
		
		return ans;
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
