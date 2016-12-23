import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] s = br.readLine().split(" ");
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		for (int i=m; i<=n;i++) {
			boolean prime = true;
			if(i==1) {
				continue;
			}
			for (int j=2; j<=(int)Math.sqrt(i); j++) {
				if (i%j==0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i);
			}
		}
	}
}