import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] parent;

	public static void main(String[] arsg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		parent = new int[n + 1];
		
		for(int i=0; i<=n; i++) {
			parent[i] = i;
		}
		
		while (m-- > 0) {
			s = br.readLine().split(" ");
			int flag = Integer.parseInt(s[0]);
			int a = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);

			if (flag == 0)
				union(a, b);
			else
				check(a, b);
		}

	}

	static int find(int x) {
		if (parent[x] == x) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	}

	static void union(int a, int b) {
		a = find(a);
		b = find(b);

		if(a < b){
			parent[b] = parent[a];
		} else {
			parent[a] = parent[b];
		}
	}

	static void check(int a, int b) {
		a = find(a);
		b = find(b);

		if (a == b)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}