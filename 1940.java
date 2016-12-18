import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		int M = sc.nextInt();
		int sum = 0;
		for (int i=0; i<N; i++) {
			int Z = sc.nextInt();
			array[i] = Z;
		}
		int j = 0;
		for (int i=0; i<N; i++) {
			for (j=i+1; j<N; j++) {
				if(array[i]+array[j] == M) {
					sum += 1;
				}
			}
		}
		System.out.println(sum);
	}
}