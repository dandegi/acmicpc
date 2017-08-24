
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Edge {
	int x, y, cost;

	public Edge(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] parent = new int[n+1];
		int minCost = 0;
		
		Edge[] e = new Edge[m];

		for (int i = 1; i <= n; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < m; i++) {
			String[] ss = br.readLine().split(" ");
			e[i] = new Edge(Integer.parseInt(ss[0]), Integer.parseInt(ss[1]), Integer.parseInt(ss[2]));
		}

		Arrays.sort(e, new Comparator<Edge>() {
			public int compare(Edge a, Edge b) {
				return a.cost - b.cost;
			}
		});
		
		for(int i=0; i<m; i++) {
			int rootx = find(e[i].x, parent);
			int rooty = find(e[i].y, parent);
			
			if(rootx == rooty) {
				continue;
			} else {
				parent[rootx] = rooty;
				minCost = minCost + e[i].cost;
			}
		}
		System.out.println(minCost);

	}
	
	private static int find(int x, int[] parent) {
		if(x == parent[x]) {
			return x;
		} else {
			parent[x] = find(parent[x], parent);
			return parent[x];
		}
	}
}
