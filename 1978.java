import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			boolean prime = false;
			for (int j=2; j<array[i]; j++) {
				if(array[i]%j==0) {
					prime = true;
				}
			}
			if(array[i]==1) {
				prime = true;
			}
			if(prime == false){
				count++;
			}
		}
		System.out.println(count);
	}
}