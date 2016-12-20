import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int[n];
		put(array);
		swap(array);
	}
	public static void put(int[] array) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		for (int i=0; i<s.length; i++) {
			array[i] = Integer.parseInt(s[i]);
		}
	}
	public static void swap(int[] array) {
			for (int j=1; j<array.length; j++) {
				int n = array[0];
				array[0] = array[j];
				array[j] = n;
			}
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}