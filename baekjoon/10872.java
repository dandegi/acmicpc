import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[] dp = new int[n+1];
		dp[0] = 1;
		for(int i=1; i<=n; i++) {
			dp[i] = i* dp[i-1];
		}
		
		System.out.println(dp[n]);
	}
}