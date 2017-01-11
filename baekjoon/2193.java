import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[n];
		if(n<2) {
			dp[0] = 1;
		} else if(n<3) {
			dp[0] = 1;
			dp[1] = 1;
		} else {
			dp[0] = 1;
			dp[1] = 1;
		}
		for(int i=2; i<n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n-1]);
	}
}