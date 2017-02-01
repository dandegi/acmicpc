import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void bfs(ArrayList<Integer>[] a, boolean[] c, int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(v);
		c[v] = true;
		
		while(!q.isEmpty()) {
			int vv = q.poll();
			int size = a[vv].size();
			
			for(int i=1; i<=size; i++) {
				if(c[a[vv].get(i-1)] == false) {
					
					q.offer(a[vv].get(i-1));
					c[a[vv].get(i-1)] = true;
					
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int cnt = 0;
		boolean[] c = new boolean[n + 1];
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for(int i=0; i<=n; i++) {
			a[i] = new ArrayList<>();
		}
		for (int j = 1; j <= m; j++) {
			String[] ss = br.readLine().split(" ");
			int v = Integer.parseInt(ss[0]);
			int vv = Integer.parseInt(ss[1]);
			a[v].add(vv);
			a[vv].add(v);
		}
		for (int j = 1; j <= n; j++) {
			if (c[j] == false) {
				bfs(a, c, j);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
