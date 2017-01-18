import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		if (k == 0) {
			System.out.println(1);
			return;
		}
		int ans = 0;
		ans = facto(n) / (facto(k) * facto(n - k));
		System.out.println(ans);
	}

	public static int facto(int x) {
		if(x == 0) {
			return 1;
		} else if (x == 1) {
			return 1;
		} else {
			return x * facto(x - 1);
		}
	}
}