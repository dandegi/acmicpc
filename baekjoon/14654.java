import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0, cntA = 0, cntB = 0;
		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n];
		int[] b = new int[n];

		String[] s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}

		s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(s[i]);
		}

		for (int i = 0; i < n; i++) {

			switch (a[i]) {
			case 1:
				if (b[i] == 1) {
					if(cntA > cntB) {
						cntB++;
						cntA = 0;
					} else {
						cntA++;
						cntB = 0;
					}
				} else if (b[i] == 2) {
					cntA = 0;
					cntB++;
					ans = max(cntB, ans);
				} else {
					cntB = 0;
					cntA++;
					ans = max(cntA, ans);
				}
				break;

			case 2:
				if (b[i] == 1) {
					cntB = 0;
					cntA++;
					ans = max(cntA, ans);
				} else if (b[i] == 2) {
					if(cntA > cntB) {
						cntB++;
						cntA = 0;
					} else {
						cntA++;
						cntB = 0;
					}
				} else {
					cntA = 0;
					cntB++;
					ans = max(cntB, ans);
				}
				break;

			case 3:
				if (b[i] == 1) {
					cntA = 0;
					cntB++;
					ans = max(cntB, ans);
				} else if (b[i] == 2) {
					cntB = 0;
					cntA++;
					ans = max(cntA, ans);
				} else {
					if(cntA > cntB) {
						cntB++;
						cntA = 0;
					} else {
						cntA++;
						cntB = 0;
					}
				}
				break;

			}
		}
		System.out.println(ans);
	}
}