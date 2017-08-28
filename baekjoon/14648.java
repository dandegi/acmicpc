import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] array;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int q = Integer.parseInt(s[1]);

		s = br.readLine().split(" ");
		array = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			array[i] = Integer.parseInt(s[i - 1]);
		}

		while (q-- > 0) {
			s = br.readLine().split(" ");

			if (Integer.parseInt(s[0]) == 1)
				q1(s);
			else
				q2(s);
		}
	}

	static int merge(int a, int b) {
		int temp = 0;
		for (int i = a; i <= b; i++) {
			temp += array[i];
		}
		return temp;
	}

	static void q1(String[] s) {
		int a = Integer.parseInt(s[1]);
		int b = Integer.parseInt(s[2]);

		System.out.println(merge(a, b));

		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	static void q2(String[] s) {
		int a = Integer.parseInt(s[1]);
		int b = Integer.parseInt(s[2]);
		int c = Integer.parseInt(s[3]);
		int d = Integer.parseInt(s[4]);

		int ac = merge(a, b);
		int cd = merge(c, d);
		System.out.println(ac - cd);

	}
}