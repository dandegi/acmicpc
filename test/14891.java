import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	static LinkedList<Integer>[] list = (LinkedList<Integer>[]) new LinkedList[5];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s;
		for (int i = 1; i <= 4; i++) {
			list[i] = new LinkedList<>();
			s = br.readLine().split("");
			for (int j = 0; j < 8; j++) {
				list[i].add(Integer.parseInt(s[j]));
			}
		}

		int k = Integer.parseInt(br.readLine());
		while (k-- > 0) {
			s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int d = Integer.parseInt(s[1]);

			left(n - 1, -d);
			right(n + 1, -d);
			rotate(n, d);
		}

		int ans = 0;
		for (int i = 0; i < 4; i++) {
			if (list[i + 1].get(0) == 1) {
				ans += (int) Math.pow(2, i);
			}
		}
		System.out.println(ans);
	}

	public static boolean check(int a, int b) {
		if (a > b) {
			if (list[a].get(6) == list[b].get(2))
				return false;
			else
				return true;
		} else {
			if (list[a].get(2) == list[b].get(6))
				return false;
			else
				return true;
		}
	}

	public static void rotate(int n, int d) {
		if (d == 1)
			list[n].addFirst(list[n].pollLast());
		else
			list[n].addLast(list[n].pollFirst());
	}

	public static void left(int n, int d) {
		if (!(1 <= n && n <= 4))
			return;

		if (check(n, n + 1)) {
			left(n - 1, -d);
			rotate(n, d);
		}
	}

	public static void right(int n, int d) {
		if (!(1 <= n && n <= 4))
			return;

		if (check(n, n - 1)) {
			right(n + 1, -d);
			rotate(n, d);
		}
	}
}