import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] s = sc.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] array = new int[n+ 1][m+ 1];
		for (int i = 1; i <= n; i++) {
			String [] ss = sc.nextLine().split(" ");
			for (int j = 1; j <= m; j++) {
				
				array[i][j] = Integer.parseInt(ss[j-1]);
			}
		}
		int k = sc.nextInt();
			sc.nextLine();
		for (int i = 0; i < k; i++) {
			int sum = 0;
			String [] sss = sc.nextLine().split(" ");
			int a = Integer.parseInt(sss[0]);
			int b = Integer.parseInt(sss[1]);
			int c = Integer.parseInt(sss[2]);
			int d = Integer.parseInt(sss[3]);
			for (int j = a; j <= c; j++) {
				for (int t=b; t<=d; t++) {
					sum += array[j][t];
				}
			}
			System.out.println(sum);
		}
	}
}