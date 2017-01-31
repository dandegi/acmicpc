import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void dfs(int[][] a, boolean[] c, int start, int v, int[][] ans) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(start);
		while (!stack.isEmpty()) {
			boolean cc = false;
			int vv = stack.peek();
			for (int i = 1; i <= v; i++) {
				if (a[vv][i] == 1 && c[i] == false) {
					cc = true;
					stack.push(i);
					c[i] = true;
					ans[start][i] = 1;
					break;
				}
			}
			if (cc == false) {
				stack.pop();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v = Integer.parseInt(br.readLine());
		int[][] a = new int[v + 1][v + 1];
		int[][] ans = new int[v + 1][v + 1];
		boolean[] c = new boolean[v + 1];
		for (int i = 1; i <= v; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 1; j <= v; j++) {
				a[i][j] = Integer.parseInt(s[j - 1]);
			}
		}

		for (int i = 1; i <= v; i++) {
			c = new boolean[v+1];
			dfs(a, c, i, v, ans);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=v; i++) {
			for(int j=1; j<=v; j++) {
				sb.append(ans[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
