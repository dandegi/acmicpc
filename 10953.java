import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		for(int i=0; i<n; i++) {
			String[] s = sc.nextLine().split(",");
			
			sum = (int)s[0].charAt(0)-48 + (int)s[1].charAt(0)-48;
			System.out.println(sum);
		}
	}
}