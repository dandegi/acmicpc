import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		for (int i = 0; i < size; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			for (int z = 0; z < size; z++) {
				System.out.print(arr[z] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
}