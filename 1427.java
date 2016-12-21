import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] array = new int[s.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) s.charAt(i) - 48;
		}
		for (int i = 0; i < array.length; i++) {
			int a = 0;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					int t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}