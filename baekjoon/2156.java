import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		if (n == 1) {
			System.out.println(arr[1]);
			return;
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		dp[2] = arr[2] + dp[1];

		for (int i = 3; i <= n; i++) {

			dp[i] = max(dp[i - 3] + arr[i] + arr[i - 1], dp[i - 2] + arr[i]);
			dp[i] = max(dp[i - 1], dp[i]);
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < dp.length; i++) {
			if (max < dp[i]) {
				max = dp[i];
			}
		}

		System.out.println(max);
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}