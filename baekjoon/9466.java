import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder sb = new StringBuilder();
	// 사이클인것을 찾아서 정점 갯수에서 사이클인 정점들 갯수를 빼서 답을 구한다
	public static int dfs(int[] a, int[] c, int[] s, int v, int step) {
		int cnt = 1;
		
		while(true) {
			
			if(c[v]!=0) {
				if(s[v]!=step) {
					return 0;
				}
				return cnt - c[v];
			}
			
			s[v] = step;
			c[v] = cnt;
			v = a[v];
			
			cnt++;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int result = 0;
			int[] a = new int[n+1];
			int[] c = new int[n+1];
			int[] s = new int[n+1];
			
			String[] ss = br.readLine().split(" ");
			for (int i = 1; i <= n; i++) {
				a[i] = Integer.parseInt(ss[i-1]);
			}

			for (int i = 1; i <= n; i++) {
				if(c[i] == 0) {
					result += dfs(a, c, s, i, i);
				}
			}
			int ans = n - result;
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}
