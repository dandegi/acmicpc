import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int q = Integer.parseInt(s[2]);
		int[] num = new int[k+1];
		char[] c = new char[k+1];
		boolean[] chk = new boolean[26];
		
		for(int i=1; i<=k; i++) {
			s = br.readLine().split(" ");
			num[i] = Integer.parseInt(s[0]);
			c[i] = s[1].charAt(0);
		}
		
		if(num[q]==0) {
			System.out.println(-1);
			return;
		}
		chk[0] = true;
		
		for(int i=1; i<=k; i++) {
			if(num[i]>=num[q])
				chk[c[i]-65] = true;
		}
		
		for(int i=0; i<n; i++) {
			if(chk[i]!=true)
				System.out.print((char)(i+65) + " ");
		}
	}
}