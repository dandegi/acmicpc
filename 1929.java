import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		boolean[] array = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			array[i] = true;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {

			if (array[i] == false) {
				continue;
			}
			for (int j = i + i; j <= n; j += i) {
				array[j] = false;
			}
		}
		for (int i = m; i <= n; i++) {
			if (array[i] == true) {
				System.out.println(i);
			}
		}
	}
}