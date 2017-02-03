import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static StringBuilder sb = new StringBuilder();

	public static int bfs(ArrayList<Integer>[] a, boolean[] c, int v) {
		int cnt = 0;
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
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = Integer.parseInt(br.readLine());
		boolean[] c = new boolean[com + 1];
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[com + 1];
		for (int i = 0; i <= com; i++) {
			a[i] = new ArrayList<Integer>();
		}

		int net = Integer.parseInt(br.readLine());
		for (int i = 1; i <= net; i++) {
			String[] s = br.readLine().split(" ");
			a[Integer.parseInt(s[0])].add(Integer.parseInt(s[1]));
			a[Integer.parseInt(s[1])].add(Integer.parseInt(s[0]));
		}

		System.out.println(bfs(a, c, 1));

	}
}
