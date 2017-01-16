import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine().trim());
		}
		dp[1] = arr[1];

		if (dp[1] + arr[2] + arr[4] > arr[2] + arr[3]) {
			dp[2] = dp[1] + arr[2];
		} else {
			dp[2] = arr[2];
		}


		for (int i = 3; i <= n; i++) {
			if (arr[i] + arr[i - 1] + dp[i - 3] > arr[i] + dp[i - 2]) {
				dp[i] = arr[i] + arr[i - 1] + dp[i - 3];
			} else {
				dp[i] = arr[i] + dp[i - 2];
			}
		}
		System.out.println(dp[n]);
	}
}