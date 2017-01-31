import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void dfs(ArrayList<Integer>[] a, boolean[] c, int start) {
		if (c[start]) {
			return;
		}
		c[start] = true;
		// for (int vv : a[start]) {
		//
		// if (!c[vv]) {
		// dfs(a, c, vv);
		// }
		//
		// }
		int size = a[start].size();
		for (int i = 1; i <= size; i++) {
			if (c[a[start].get(i-1)] == false) {
				dfs(a, c, a[start].get(i - 1));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int cnt = 0;
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
			for (int j = 0; j <= n; j++) {
				a[j] = new ArrayList<Integer>();
			}
			boolean[] c = new boolean[n + 1];
			String[] s = br.readLine().split(" ");
			for (int j = 1; j <= n; j++) {
				a[j].add(Integer.parseInt(s[j - 1]));
			}

			for (int j = 1; j <= n; j++) {
				if (c[j] == false) {
					dfs(a, c, j);
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}
}
