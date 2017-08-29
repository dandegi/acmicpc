import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] array;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long cnt1 = 0, cnt2 = 0, cnt3 = 0;
		int[] a = new int[101];
		for (int i = 1; i <= 100; i++) {
			a[i] = 1;
		}
		double p = Double.parseDouble(br.readLine());
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);

			if (s[1].equals("R")) {
				for (int i = x + 1; i <= 100; i++) {
					if (a[i] == 3)
						a[i] = 1;
					else
						a[i]++;
				}
			} else {
				for (int i = x - 1; i >= 1; i--) {
					if (a[i] == 3)
						a[i] = 1;
					else
						a[i]++;
				}
			}

		}
		for (int i = 1; i <= 100; i++) {
			switch (a[i]) {
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			case 3:
				cnt3++;
				break;
			}
		}

		System.out.printf("%.2f\n", p * cnt1 / 100);
		System.out.printf("%.2f\n", p * cnt2 / 100);
		System.out.printf("%.2f", p * cnt3 / 100);

	}
}