import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[] {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
		String s = br.readLine();
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			int temp = (int)s.charAt(i)-65;
			sum+= arr[temp];
		}
		System.out.println(sum);
	}
}