import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[n];
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			for (int j=i+1; j<arr.length; j++) {
				sum += arr[j];
				if(sum>max) {
					max = sum;
				}
			}
			sum = 0;
		}
		System.out.println(max);
	}
}