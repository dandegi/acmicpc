import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s;
		long ans = 0;
		long n = Long.parseLong(br.readLine());
		long[] a = new long[(int)n];
		s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(s[i]);
		}
		s = br.readLine().split(" ");
		long b = Long.parseLong(s[0]);
		long c = Long.parseLong(s[1]);

		for (int i = 0; i < n; i++) {
			long temp = a[i];
			temp -= b;
			ans += 1;
			if (temp < 1)
				continue;
			ans += temp / c;
			if (temp % c > 0)
				ans += 1;
		}
		System.out.println(ans);
	}
}
