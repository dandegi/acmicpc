import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static int[][] s = new int[21][21];
	static int ans = Integer.MAX_VALUE;
	static boolean[] visit = new boolean[21];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 1; j <= n; j++) {
				s[i][j] = Integer.parseInt(str[j-1]);
			}
		}

		dfs(0, 0);
		System.out.println(ans);
	}

	public static void dfs(int v, int len) {
		if (len == n / 2) {
			divideteam();
		} else {
			for (int i = v + 1; i <= n; i++) {
				if (!visit[i]) {
					visit[i] = true;
					dfs(i, len + 1);
				}
			}
		}

		visit[v] = false;

	}

	public static void divideteam() {
		int[] a = new int[n / 2 + 1];
		int[] b = new int[n / 2 + 1];
		int ai = 1, bi = 1;
		for (int i = 1; i <= n; i++) {
			if (visit[i]) {
				a[ai++] = i;
			} else {
				b[bi++] = i;
			}
		}
		
		int aStat = getStat(a);
		int bStat = getStat(b);
		int diff = Math.abs(aStat - bStat);
		
		if(ans > diff) {
			ans = diff;
		}
	}
	
	public static int getStat(int[] arr) {
		int res = 0;
		int len = n/2;
		
		
		for(int i=1; i<=len; i++) {
			for(int j=i+1; j<=len; j++) {
				res += s[arr[i]][arr[j]];
				res += s[arr[j]][arr[i]];
			}
		}
		return res;
	}
}