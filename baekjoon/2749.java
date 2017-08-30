import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mod = 1000000;
		int p = mod/10*15;
		long[] f = new long[p];
		f[0] = 0;
		f[1] = 1;
		
		long n = Long.parseLong(br.readLine());
		for (int i=2; i<p; i++) {
	        f[i] = f[i-1] + f[i-2];
	        f[i] %= mod;
	    }
		System.out.println(f[(int) (n%p)]);
	}
}