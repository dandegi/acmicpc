import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int max = 0;
		String n = br.readLine();

		for (int i = 0; i < n.length(); i++) {

			int t = n.charAt(i) - 48;
			if (t == 9 || t == 6) {
				arr[9]++;
				arr[6]++;
			} else {
				arr[t]++;
			}
		}
		max = arr[0];
		if (arr[6] > 0 && arr[6]%2 == 0) {
			
			
			arr[6] = arr[6] / 2;
			arr[9] = arr[9] / 2;

		} else {

			arr[6] = arr[6] / 2 + 1;
			arr[9] = arr[9] / 2 + 1;

		}
		for (int i = 0; i < 10; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

		}

		System.out.println(max);

	}

}