import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Pair {
	int x, y, r;

	public Pair(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
}

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void dfs(ArrayList<Integer>[] a, boolean[] c, int v) {
		if (c[v]) {
			return;
		}

		c[v] = true;
		int size = a[v].size();
		for (int i = 1; i <= size; i++) {
			if (!c[a[v].get(i - 1)]) {
				dfs(a, c, a[v].get(i - 1));
			}
		}
	}

	public static boolean connect(Pair a, Pair b) {
		int distance = (b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y);
		int range = (a.r + b.r) * (a.r + b.r);

		if (range >= distance) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int cnt = 0;

			int n = Integer.parseInt(br.readLine());
			boolean[] c = new boolean[n + 1];
			ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
			for (int i = 0; i <= n; i++) {
				a[i] = new ArrayList<Integer>();
			}
			Pair[] pair = new Pair[n + 1];
			for (int i = 0; i < n; i++) {
				String[] s = br.readLine().split(" ");
				int x = Integer.parseInt(s[0]);
				int y = Integer.parseInt(s[1]);
				int r = Integer.parseInt(s[2]);

				pair[i + 1] = new Pair(x, y, r);
			}

			for (int i = 1; i <= n; i++) {

				for (int j = i + 1; j <= n; j++) {

					if (connect(pair[i], pair[j])) {
						a[i].add(j);
						a[j].add(i);
					}
				}
			}

			for (int i = 1; i <= n; i++) {
				if (!c[i]) {
					dfs(a, c, i);
					cnt++;
				}
			}
			
			sb.append(cnt).append("\n");
			
		}
		System.out.print(sb);
	}
}