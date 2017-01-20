import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void dfs(ArrayList<ArrayList<Integer>> a, boolean[] c, int start) {
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		c[start] = true;
		sb.append(start).append(" ");
		while (!stack.isEmpty()) {
			int vv = stack.peek();
			int size = a.get(vv).size();
			boolean cc = false;
			
			for (int i = 0; i < size; i++) {
				int v = (int) a.get(vv).get(i);
				if (c[v] == false) {
					stack.push(v);
					c[v] = true;
					cc = true;
					sb.append(v).append(" ");
					break;
				}
			}
			if (cc == false) {
				stack.pop();
			}
		}
	}

	public static void bfs(ArrayList<ArrayList<Integer>> a, boolean[] c, int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		c[start] = true;
		sb.append(start).append(" ");
		while (!q.isEmpty()) {
			int vv = q.poll();
			int size = a.get(vv).size();
			
			for (int i = 0; i < size; i++) {
				int v = (int) a.get(vv).get(i); 
				if (c[v] == false) {
					q.offer(v);
					c[v] = true;
					sb.append(v).append(" ");
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
		boolean[] c = new boolean[v + 1];
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= v; i++) {
			a.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < e; i++) {
			String[] ss = br.readLine().split(" ");
			int n = Integer.parseInt(ss[0]);
			int m = Integer.parseInt(ss[1]);
			a.get(n).add(m);
			a.get(m).add(n);
		}

		for (int i = 0; i < a.size(); i++) {
			Collections.sort(a.get(i));
		}

		dfs(a, c, start);
		sb.append("\n");
		c = new boolean[v + 1];
		bfs(a, c, start);
		System.out.println(sb);
	}
}
