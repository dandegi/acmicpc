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

		boolean prime = false;
		for (int i = 0; i < n; i++) {
			for (int j=2; j<array[i]; j++) {
				System.out.println("실행"+j);
				if(array[i]%j==0) {
					prime = true;
					break;
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