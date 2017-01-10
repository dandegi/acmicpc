import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//값이 두개 :  dp[n][l] = MAX(dp[n-1][l-1], dp[n-1][l])
//왼쪽 dp[n][l] += dp[n-1][l]
//오른쪽 dp[n][l] += dp[n-1][l-1];

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[][]arr = new int[n][n];
		for(int i=0; i<n; i++) {
			String [] s = br.readLine().split(" ");
			for(int j=0; j<s.length; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
			}
		}
		for(int i=1; i<n; i++) {
			
			for(int j=0; j<=i; j++) {
				if(j==0) {
					arr[i][j] += arr[i-1][j];
				}else if(j==i) {
					arr[i][j] += arr[i-1][j-1];
				} else {
					arr[i][j] += big(arr[i-1][j-1], arr[i-1][j]);
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(max<arr[n-1][i]) {
				max = arr[n-1][i];
			}
		}
		System.out.println(max);
		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.println(arr[i][j]);
//			}
//			System.out.println();
//		}
	}
	public static int big(int a, int b) {
		if(a<b) {
			return b;
		} else {
			return a;
		}
	}
}