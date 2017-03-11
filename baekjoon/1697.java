import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void bfs(int[] a, int x, int y) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(x);
		a[x] = 0;

		while (!q.isEmpty()) {

			int v = q.poll();

			if (v == y) {
				break;
			}

			if (v + 1 >= 0 && v + 1 < 100001) {
				if ((a[v] + 1) < a[v + 1]) {

					q.offer(v + 1);
					a[v + 1] = a[v] + 1;

				}
			}

			if (v - 1 >= 0 && v - 1 < 100001) {
				if ((a[v] + 1) < a[v - 1]) {

					q.offer(v - 1);
					a[v - 1] = a[v] + 1;

				}
			}

			if (v * 2 >= 0 && v * 2 < 100001) {
				if ((a[v] + 1) < a[v * 2]) {

					q.offer(v * 2);
					a[v * 2] = a[v] + 1;

				}
			}

		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");

		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);

		int[] a = new int[100001];
		Arrays.fill(a, Integer.MAX_VALUE);

		bfs(a, x, y);
		System.out.println(a[y]);
	}
}