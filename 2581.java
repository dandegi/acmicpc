import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		boolean [] array = new boolean[n+1];
		for (int i=2; i<=n; i++) {
			array[i] = true;
		}
		for (int i=2; i<=(int)Math.sqrt(n); i++) {
			if (array[i]==false) {
				continue;
			}
			for (int j=i+i; j<=n; j+=i) {
					array[j] = false;
			}
		}
		int sum = 0;
		int min = 10000;
		for(int i=m; i<=n; i++){
			if(array[i]==true) {
				sum += i;
				if(i < min) {
					min = i;
				}
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}
		else {
		System.out.println(sum);
		System.out.println(min);
		}
	}
}