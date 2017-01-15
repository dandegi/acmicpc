import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[][] dp = new int[n][3];
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0; j<3; j++) {
				dp[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		for(int i=1; i<n; i++) {
			
			for(int j=0; j<3; j++) {
				if(dp[i][j]+dp[i-1][(j+1)%3] < dp[i][j]+dp[i-1][(j+2)%3]) {
					dp[i][j] += dp[i-1][(j+1)%3];
				} else {
					dp[i][j] += dp[i-1][(j+2)%3];
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0; i<3; i++) {
			if(min>dp[n-1][i]) {
				min = dp[n-1][i];
			}
		}
		System.out.println(min);
	}
}