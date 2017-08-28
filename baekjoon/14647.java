import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count(int x) {
		int t = 0;
		while (x != 0) {
			if (x % 10 == 9)
				t++;
			x /= 10;
		}
		return t;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int cnt = 0;
		int max = 0;

		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			s = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(s[j]);

			}
		}

		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = 0; j < m; j++) {
				temp += count(a[i][j]);
				cnt += count(a[i][j]);
				if (max < temp) {
					max = temp;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			int temp = 0;
			for (int j = 0; j < n; j++) {
				temp += count(a[j][i]);
				if (max < temp) {
					max = temp;
				}
			}
		}

		System.out.println(cnt - max);
	}
}