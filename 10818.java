import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[2000003];

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if (m < 0) {
				array[m + 1000001]++;
			}
			if (m > 0) {
				array[m + 1000001]++;
			}
			if (m == 0) {
				array[m + 1000001]++;
			}
		}
		int start = 0, end = 2000002;
		while (true) {
			if (array[start] == 1) {
				if (start == 1000001) {
					System.out.print(0 + " ");
					break;
				}
				if (array[start] < 0) {
					System.out.print((start - 100000) + " ");
					break;
				}
				if (array[start] > 0) {
					System.out.print((start - 1000001) + " ");
					break;
				}
			}
			start++;
		}
		while (true) {
			if (array[end] == 1) {
				System.out.println((end - 1000001));
				break;
			}
			end--;
		}
	}
}