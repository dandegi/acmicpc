import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int map[][];
	static int n, m;
	static int min = Integer.MAX_VALUE;

	static ArrayList<Node> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		map = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			s = br.readLine().split(" ");
			for (int j = 1; j <= n; j++) {
				map[i][j] = Integer.parseInt(s[j-1]);
				if (map[i][j] == 2) {
					list.add(new Node(j, i));
				}
			}
		}

		int[][] dist = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			Arrays.fill(dist[i], 9999);
		}
		search(0, 0, dist);
		System.out.println(min);
	}

	private static void search(int next, int cnt, int[][] prev) {
		int size = list.size();
		for (int i = next; i < size; i++) {
			int[][] dist = new int[n + 1][n + 1];
			for (int j = 1; j <= n; j++) {
				dist[j] = Arrays.copyOf(prev[j], n + 1);
			}
			Node node = list.get(i);
			int x = node.x;
			int y = node.y;

			int sum = totalDist(x, y, dist);

			if (cnt + 1 == m) {
				if (sum < min)
					min = sum;
			} else
				search(i + 1, cnt + 1, dist);
		}
	}

	private static int totalDist(int x, int y, int[][] dist) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (map[i][j] == 1) {
					int d = Math.abs(y - i) + Math.abs(x - j);
					if (dist[i][j] > d)
						dist[i][j] = d;
					sum += dist[i][j];
				}
			}
		}
		return sum;
	}
}

class Node {
	int x, y;

	Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}