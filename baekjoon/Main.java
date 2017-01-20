import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		String[] s = br.readLine().split(" ");
		int v = Integer.parseInt(s[0]);
		int e = Integer.parseInt(s[1]);
		int st = Integer.parseInt(s[2]);
		ArrayList<ArrayList> a = new ArrayList<ArrayList>();
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
		for(int i=0; i<a.size(); i++) {
			Collections.sort(a.get(i));
		}
		boolean[] c = new boolean[v + 1];
		StringBuilder sb = new StringBuilder();
		stack.push(st);
		c[st] = true;
		sb.append(st).append(" ");
		while (!stack.isEmpty()) {
			int vv = stack.peek();
			boolean cc = false;
			for (int i = 0; i < a.get(vv).size(); i++) {
				if (c[(int) a.get(vv).get(i)] == false) {
					stack.push((Integer) a.get(vv).get(i));
					c[(int) a.get(vv).get(i)] = true;
					cc = true;
					sb.append(a.get(vv).get(i)).append(" ");
					break;
				}
			}
			if (cc == false) {
				stack.pop();
			}
		}
		sb.append("\n");
		c = new boolean[v+1];
		q.offer(st);
		c[st] = true;
		sb.append(st).append(" ");
		
		while(!q.isEmpty()) {
			int vv = q.poll();
			
			for(int i=0; i<a.get(vv).size(); i++) {
				if(c[(int)a.get(vv).get(i)] == false) {
					q.offer((int)a.get(vv).get(i));
					c[(int)a.get(vv).get(i)] = true;
					sb.append(a.get(vv).get(i)).append(" ");
				}
			}
		}
		System.out.println(sb);
	}
}
