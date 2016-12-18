import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] array = new int[10000001];
		
		for (int i=0; i<n; i++) {
			array[sc.nextInt()]++;
		}
		
		int start = 1, end = m-1, count = 0;
		
		while (start<end) {
			if (array[start] != 0 && array[end] != 0) {
				if (start+end == m) {
					count++;
				}
			}
			start++;
			end--;
		}
		System.out.println(count);
	}
}