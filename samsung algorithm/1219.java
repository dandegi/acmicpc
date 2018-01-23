import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 10;
		while(t-->0) {
			String[] s = br.readLine().split(" ");
			int tnum = Integer.parseInt(s[0]);
			int line = Integer.parseInt(s[1]);
			
			s = br.readLine().split(" ");
			int[][] a = new int[100][100];
			boolean[] check = new boolean[100];
			int v = 0, vv = 0;
			for(int i=0; i<s.length; i++) {
				if(i%2 == 0) 
					v = Integer.parseInt(s[i]);
				else {
					vv = Integer.parseInt(s[i]);
					a[v][vv] = 1;
				}
			}
			dfs(a, check, 0);
			if(check[99] == true)
				System.out.println("#"+tnum+" "+1);
			else
				System.out.println("#"+tnum+" "+0);
		}
	}
	
	public static void dfs(int[][]a, boolean[] check, int start) {
		check[start] = true;
		for(int i=0; i<100; i++) {
			if(a[start][i]==1 && !check[i]){
				dfs(a, check, i);
			}
		}
	}
}