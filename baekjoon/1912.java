import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[] dp = new int[n];
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			dp[i] = Integer.parseInt(s[i]);
		}

		int max = dp[0];

		for (int i = 1; i < n; i++) {
			if (dp[i] + dp[i-1]> 0 && dp[i - 1] > 0) {
				dp[i] += dp[i - 1];
			}

			if (max < dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}
}