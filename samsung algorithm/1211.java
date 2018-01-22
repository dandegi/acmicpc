import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
			int[] ans = new int[100];
			int min = Integer.MAX_VALUE;
			for(int i=0; i<100; i++) {
				if(ladder[0][i] == 1) {
					boolean[][] check = new boolean[100][100];
					int[][] sum = new int[100][100];
					
					for(int j=0; j<100; j++) {
						Arrays.fill(sum[j], 1);
					}
					
					bfs(ladder, check, i, ans, sum);
					
					if(min > ans[i] && ans[i] !=0) {
						min = ans[i];
					}
				}
			}
			
			for(int i=99; i>=0; i--) {
				if(min == ans[i]) {
					System.out.println("#"+tnum+ " " + i);
					break;
				}
			}
			
		}
		
		
	}
	public static void bfs(int[][] ladder, boolean[][] check, int start, int[] ans, int[][] sum) {
		Queue<Pair> q = new LinkedList<>();
		int[] dx = {0, 0, 1};
		int[] dy = {1, -1, 0};
		q.offer(new Pair(0, start));
		sum[0][start] = 1;
		check[0][start] = true;
		Pair p = null;
		while(!q.isEmpty()) {
			p = q.poll();
			
			for(int i=0; i<3; i++) {
				int x = p.x + dx[i];
				int y = p.y + dy[i];
				if(x>=100 || x<0 || y>=100 || y<0) {
					continue;
				}
				if(ladder[x][y] == 1 && !check[x][y]) {
					q.offer(new Pair(x, y));
					check[x][y] = true;
					sum[x][y] += sum[p.x][p.y];
					break;
				} else if(ladder[x][y] == 1 && !check[x][y]) {
					q.offer(new Pair(x, y));
					check[x][y] = true;
					sum[x][y] += sum[p.x][p.y];
					break;
				} else if(ladder[x][y] == 1 && !check[x][y]) {
					q.offer(new Pair(x,y));
					check[x][y] = true;
					sum[x][y] += sum[p.x][p.y];
					break;
				}
			}
		}
		
		ans[start] = sum[p.x][p.y];
	
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
