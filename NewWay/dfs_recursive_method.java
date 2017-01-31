import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void dfs(int[][] a, boolean[] c, int v) {

		int n = a.length - 1;
		c[v] = true;
		System.out.println(v);
		for (int i = 1; i <= n; i++) {
			if (a[v][i] == 1 && !c[i]) {
				dfs(a, c, i);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] a = new int[n + 1][n + 1];
		boolean[] c = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			String[] ss = br.readLine().split(" ");
			int v = Integer.parseInt(ss[0]);
			int vv = Integer.parseInt(ss[1]);
			a[v][vv] = 1;
		}
		dfs(a, c, 1);
		for(int i=1; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
