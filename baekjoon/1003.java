import java.util.Scanner;

public class Main {
	static int cnt0 = 0;
	static int cnt1 = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[2];
		for(int i=0; i<t; i++) {
			cnt0 = 0;
			cnt1 = 0;
			int n = sc.nextInt();
			fibonacci(n);
			System.out.println(cnt0 + " " + cnt1);
		}
	}
	public static int fibonacci(int n) {
		if(n == 0) {
//			System.out.println(0);
			cnt0++;
			return 0;
		} else if(n == 1) {
//			System.out.println(1);
			cnt1++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}