import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int[][] dp = new int[1001][1001];
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);

		dp[0][0] = 1;
		dp[1][0] = 1;
		dp[1][1] = 1;

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
				}
				dp[i][j] %= 10007;
				if (i == n && j == k) {
					break;
				}
			}
		}
		System.out.println(dp[n][k]);
	}
}