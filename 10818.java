import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -1000000;
		int min = 1000000;
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			if(max<array[j]) {
				max=array[j];
			}
			if(min>array[j]) {
				min=array[j];
			}
		}
		System.out.println(min + " " + max);
	}
}