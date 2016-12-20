import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String [] s = sc.nextLine().split(" ");
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (Integer.parseInt(s[i]) + Integer.parseInt(s[j]) == m) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}