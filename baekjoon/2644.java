import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void bfs(int[][] a, boolean[]c, int[] ans, int one, int two) {
		Queue<Integer> q = new LinkedList<Integer>();
		int size = a.length;
		
		q.offer(one);
		c[one] = true;
		ans[one] = 0;
		
		while(!q.isEmpty()) {
			int v = q.poll();
			
			for(int i=1; i<size; i++) {
				
				if(a[v][i] == 1 && !c[i]) {
					q.offer(i);
					c[i] = true;
					ans[i] = ans[v]+1;

					if(i == two) {
						System.out.println(ans[i]);
						return;
					}
				}
				
			}
		}
		
		if(!c[two]) {
			System.out.println(-1);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] c = new boolean[n+1];
		int[] ans = new int[n+1];
		int[][] a = new int[n+1][n+1];
		
		String[] s = br.readLine().split(" ");
		
		int one = Integer.parseInt(s[0]);
		int two = Integer.parseInt(s[1]);
		
		int m = Integer.parseInt(br.readLine());
		for(int i=0; i<m; i++) {
			s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			a[x][y] = 1;
			a[y][x] = 1;
		}
		
		bfs(a, c, ans, one, two);
		
	}
}