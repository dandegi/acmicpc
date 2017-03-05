import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void bfs(int[] a, int[] ans, int s, int g, int u, int d) {
		Queue<Integer> q = new LinkedList<Integer>();
		int[] dx = { u, -d };

		q.offer(s);
		ans[s] = 0;

		out1: while (!q.isEmpty()) {
			int v = q.poll();

			for (int i = 0; i < 2; i++) {
				int vv = v + dx[i];

				if (vv < a.length && vv > 0 && ans[v] + 1 < ans[vv]) {
					q.offer(vv);
					ans[vv] = ans[v] + 1;

					if (vv == g) {
						break out1;
					}

				}
			}

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] st = br.readLine().split(" ");

		// f = 건물층수, s = 현재 강호의 층, g = 스타트링크 위치, u = 위로 층 수, d = 내려가는 층 수

		int f = Integer.parseInt(st[0]);
		int s = Integer.parseInt(st[1]);
		int g = Integer.parseInt(st[2]);
		int u = Integer.parseInt(st[3]);
		int d = Integer.parseInt(st[4]);

		int[] a = new int[f + 1];
		int[] ans = new int[f + 1];
		Arrays.fill(ans, Integer.MAX_VALUE);

		bfs(a, ans, s, g, u, d);

		if(ans[g] == Integer.MAX_VALUE) {
			System.out.println("use the stairs");
		} else {
			System.out.println(ans[g]);
		}
	}

}