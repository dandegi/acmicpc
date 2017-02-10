import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int max(int a, int b) {
		return (a>b)? a : b;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] a = new int[302][302];

		for (int i = 1; i <= n; i++) {
			s = br.readLine().split(" ");
			for (int j = 1; j <= m; j++) {
				a[i][j] = Integer.parseInt(s[j - 1]);
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				a[i][j] += max(a[i-1][j], a[i][j-1]);
			}
		}
		System.out.println(a[n][m]);
	}
}