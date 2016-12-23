import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] array = new int[n + 1];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i <= n; i++) {
			if(count==k) {
				break;
			}
			if (array[i]==1) {
				continue;
			}
			for (int j = i; j <= n; j += i) {
				if (array[j]==1) {
					continue;
				}
				if (array[j]==0) {
				array[j]++;
				count++;
				}
				if (count==k) {
					System.out.println(j);
					break;
				}
			}
		}
//		for(int i=0; i<=n; i++) {
//			System.out.println(array[i]);
//		}
	}
}