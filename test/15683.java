import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int n, m;
	static int ans = Integer.MAX_VALUE;
	static int[][] map;
	static ArrayList<Node> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			s = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(s[j]);
				if (1 <= map[i][j] && map[i][j] <= 5) {
					list.add(new Node(i, j, map[i][j]));
				}
			}
		}
		search(0, map);
		System.out.println(ans);
	}

	private static void search(int cctvidx, int[][] prev) {
		int[][] visited = new int[n][m];
		if (cctvidx == list.size()) {
			int temp = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (prev[i][j] == 0)
						temp++;
				}
			}
			if (temp < ans)
				ans = temp;
		} else {
			Node node = list.get(cctvidx);
			int idx = node.idx;
			int x = node.x;
			int y = node.y;

			switch (idx) {
			case 1:
				for (int k = 0; k < 4; k++) {
					for (int i = 0; i < n; i++) {
						visited[i] = Arrays.copyOf(prev[i], m);
					}
					detect(visited, y, x, k);
					search(cctvidx + 1, visited);
				}
				break;
				
			case 2:
				for(int k=0; k<2; k++) {
					for(int i=0; i<n; i++) {
						visited[i] = Arrays.copyOf(prev[i], m);
					}
					detect(visited, y, x, k);
					detect(visited, y, x, k+2);
					search(cctvidx + 1, visited);
				}
				break;
				
			case 3:
				for (int k=0; k<4; k++) {
					for (int i=0; i<n; i++) {
						visited[i] = Arrays.copyOf(prev[i], m);
					}
					detect(visited, y, x, k);
					detect(visited, y, x, (k+4)%4);
					search(cctvidx + 1, visited);
				}
				break;
				
			case 4:
				for(int k=0; k<4; k++) {
					for(int i=0; i<n; i++) {
						visited[i] = Arrays.copyOf(prev[i], m);
					}
					detect(visited, y, x, k);
					detect(visited, y, x, (k + 1) % 4);
                    detect(visited, y, x, (k + 2) % 4);
                    search(cctvidx + 1, visited);
				}
				break;
				
			case 5:
				for (int i = 0; i < n; i++) {
                    visited[i] = Arrays.copyOf(prev[i], m);
                }
                detect(visited, y, x, 0);
                detect(visited, y, x, 1);
                detect(visited, y, x, 2);
                detect(visited, y, x, 3);
                search(cctvidx + 1, visited);
                break;
			}
		}
	}

	private static void detect(int[][] visited, int i, int j, int direction) {
		switch (direction) {
		case 0:
			for (int k = j; k >= 0; k--) {
				if (map[i][k] == 6)
					break;
				visited[i][k] = 7;
			}
			break;

		case 1:
			for (int k = i; k >= 0; k--) {
				if (map[k][j] == 6)
					break;
				visited[k][j] = 7;
			}
			break;

		case 2:
			for (int k = j; k < m; k++) {
				if (map[i][k] == 6)
					break;
				visited[i][k] = 7;
			}
			break;

		case 3:
			for (int k = i; k < n; k++) {
				if (map[k][j] == 6)
					break;
				visited[k][j] = 7;
			}
			break;
		}
	}
}

class Node {
	int x, y, idx;

	Node(int x, int y, int idx) {
		this.x = x;
		this.y = y;
		this.idx = idx;
	}
}