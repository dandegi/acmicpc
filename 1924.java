import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int m = Integer.parseInt(s[0]);
		int d = Integer.parseInt(s[1]);
		int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		for(int i=1; i<=m; i++) {
			if (i == m) {
				break;
			}
			sum += arr[i];
		}
		sum += d;
		switch (sum%7) {
		case 0: {
			System.out.println("SUN");
			break;
		}
		case 1: {
			System.out.println("MON");
			break;
		}
		case 2: {
			System.out.println("TUE");
			break;
		}
		case 3: {
			System.out.println("WED");
			break;
		}
		case 4: {
			System.out.println("THU");
			break;
		}
		case 5: {
			System.out.println("FRI");
			break;
		}
		case 6: {
			System.out.println("SAT");
			break;
		}
		}
	}
}