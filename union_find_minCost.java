//http://koitp.org/problem/SDS_PRO_10_4/read/

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
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] parent = new int[n+1];
		int minCost = 0;
		
		Edge[] e = new Edge[m];

		for (int i = 1; i <= n; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < m; i++) {
			String[] s = br.readLine().split(" ");
			e[i] = new Edge(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
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
