import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	static int root[];
	static int cnt[];

	static int find(int x) {
		if (root[x] == x)
			return x;
		else
			return root[x] = find(root[x]);

	}

	static int merge(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) {
			root[b] = a;
			cnt[a] += cnt[b];
			cnt[b] = 1;
		}
		return cnt[a];
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int idx1, idx2, num = 0;
			int n = Integer.parseInt(br.readLine());
			root = new int[n * 2];
			cnt = new int[n * 2];
			for (int i = 0; i < n * 2; i++) {
				root[i] = i;
				cnt[i] = 1;
			}
			
			HashMap<String, Integer> h = new HashMap<String, Integer>();
			
			for (int i = 0; i < n; i++) {
				String[] s = br.readLine().split(" ");
				
				if (!h.containsKey(s[0]))
					h.put(s[0], num++);
				idx1 = h.get(s[0]);
				
				if (!h.containsKey(s[1]))
					h.put(s[1], num++);
				idx2 = h.get(s[1]);
				
				System.out.println(merge(idx1, idx2));
			}
		}

	}
}