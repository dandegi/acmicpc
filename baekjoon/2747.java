import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[46];
		int n = sc.nextInt();
		int size = arr.length;
		
		// dp[n] = 0~ 10 
		// dp[n] = dp[n-1] + dp[n-2];
		
		// dp[i] = dp[i-1] + dp[i-2];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<=n; i++) {
			
			arr[i] = arr[i-1] + arr[i-2];
			
		}
		System.out.println(arr[n]);
	}
}