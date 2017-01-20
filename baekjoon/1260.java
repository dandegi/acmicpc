import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> qu = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int o = Integer.parseInt(s[2]);
		int[][] arr = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			String[] ss = br.readLine().split(" ");
			arr[Integer.parseInt(ss[0])][Integer.parseInt(ss[1])] = 1;
			arr[Integer.parseInt(ss[1])][Integer.parseInt(ss[0])] = 1;
		}

		stack.push(o);
		boolean[] c = new boolean[n + 1];
		c[o] = true;
		sb.append(o).append(" ");
		while (!stack.isEmpty()) {
			boolean cc = false;
			int v = stack.peek();
			for (int i = 1; i <= n; i++) {
				if (arr[v][i] == 1 && c[i] == false) {
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
		
		sb.append("\n");
		qu.offer(o);
		c = new boolean[n+1];
		c[o] = true;
		sb.append(o).append(" ");
		while(!qu.isEmpty()) {
			int v = qu.poll();
			
			for(int i=1; i<=n; i++) {
				if(arr[v][i] == 1 && c[i] == false) {
					c[i] = true;
					qu.offer(i);
					sb.append(i).append(" ");
				}
			}
		}
		System.out.println(sb);
	}
}
