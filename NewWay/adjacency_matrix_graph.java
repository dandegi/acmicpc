import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void dfs(int[][] a, boolean[] c, int start, int v) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(start);
		c[start] = true;
		sb.append(start).append(" ");
		while (!stack.isEmpty()) {
			boolean cc = false;
			int vv = stack.peek();
			for (int i = 1; i <= v; i++) {
				if (a[vv][i] == 1 && c[i] == false) {
					cc = true;
					stack.push(i);
					c[i] = true;
					sb.append(i).append(" ");
					break;
				}
			}
			if (cc == false) {
				stack.pop();
			}
		}
	}

	public static void bfs(int[][] a, boolean[] c, int start, int v) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(start);
		c[start] = true;
		sb.append(start).append(" ");
		while (!qu.isEmpty()) {
			int vv = qu.poll();

			for (int i = 1; i <= v; i++) {
				if (a[vv][i] == 1 && c[i] == false) {
					c[i] = true;
					qu.offer(i);
					sb.append(i).append(" ");
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int v = Integer.parseInt(s[0]);
		int e = Integer.parseInt(s[1]);
		int start = Integer.parseInt(s[2]);
		int[][] a = new int[v + 1][v + 1];
		for (int i = 0; i < e; i++) {
			String[] ss = br.readLine().split(" ");
			int m = Integer.parseInt(ss[0]);
			int n = Integer.parseInt(ss[1]);
			a[m][n] = 1;
			a[n][m] = 1;
		}
		boolean[] c = new boolean[v + 1];
		dfs(a, c, start, v);
		sb.append("\n");
		c = new boolean[v+1];
		bfs(a, c, start, v);
		System.out.println(sb);
	}
}
