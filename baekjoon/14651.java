import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		if(n==1) {
			System.out.println(0);
			return;
		}
		long[] a = new long [n+1];
		a[1] = 0;
		a[2] = 2;
		for(int i=3; i<=n; i++) {
			a[i] = (a[i-1]*3)%1000000009;
		}
		System.out.println(a[n]);
	}
}