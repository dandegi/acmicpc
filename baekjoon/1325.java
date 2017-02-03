import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static StringBuilder sb = new StringBuilder();

	public static void bfs(ArrayList<Integer>[] a, boolean[] c, int v, int[] res) {
		int cnt = 1;
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(v);
		c[v] = true;
		
		while (!q.isEmpty()) {
			int vv = q.poll();
			int size = a[vv].size();

			for (int i = 1; i <= size; i++) {
				if (c[a[vv].get(i - 1)] == false) {
					q.offer(a[vv].get(i - 1));
					c[a[vv].get(i - 1)] = true;
					cnt++;
				}
			}
		}
		
		res[v] = cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");

		int n = Integer.parseInt(s[0]);
		boolean[] c = new boolean[n + 1];
		int[] res = new int[n+1];
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 0; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}

		int m = Integer.parseInt(s[1]);
		for (int i = 1; i <= m; i++) {
			String[] ss = br.readLine().split(" ");
			a[Integer.parseInt(ss[1])].add(Integer.parseInt(ss[0]));
		}

		for (int i = 1; i <= n; i++) {
			c = new boolean[n + 1];
//			Arrays.fill(c, false);  c배열을 false로 초기
			bfs(a, c, i, res);
		}
		
		
		int max = Integer.MIN_VALUE;
		for(int i=1; i<res.length; i++) {
			if(max<res[i]) {
				max = res[i];
			}
		}
		
		for(int i=1; i<res.length; i++) {
			if(max==res[i]) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb);
	}
}
