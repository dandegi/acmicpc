import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;
	public static void bfs(int[][] a, boolean[] c, int start, int v) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(start);
		boolean ccc = false;
		while (!qu.isEmpty()) {
			int vv = qu.poll();

			for (int i = 1; i <= v; i++) {
				if (a[vv][i] == 1 && c[i] == false) {
					c[i] = true;
					qu.offer(i);
					ccc = true;
				}
			}
		}
		if(ccc) {
			cnt++;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			cnt = 0;
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			int[][] a = new int[n + 1][n + 1];
			boolean[] c = new boolean[n + 1];
			
			for (int j = 1; j <= n; j++) {
				a[j][Integer.parseInt(s[j - 1])] = 1;
			}

			for (int j = 1; j <= n; j++) {
				bfs(a, c, j, n);
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}
}
