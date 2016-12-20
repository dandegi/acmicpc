import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		sc.nextLine();
		int [] array = new int[n];
		String [] s = sc.nextLine().split(" ");
		for (int i=0; i<n; i++) {
			array[i] = Integer.parseInt(s[i]);
			if (max<array[i]) {
				max = array[i];
			}
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println(min+" "+max);
	}
}