import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] array = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int sum = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			for (int j = a; j <= c; j++) {
				for (int t=b; t<=d; t++) {
					sum += array[j][t];
				}
			}
			System.out.println(sum);
		}
	}
}