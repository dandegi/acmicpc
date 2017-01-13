import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) {
				arr[(int) s.charAt(i) - 65]++;
			} else {
				arr[(int) s.charAt(i)-97]++;
			}
		}
		int max = Integer.MIN_VALUE;
		int maxidx = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxidx = i;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(max == arr[i]) {
				list.add(arr[i]);
			}
			if(list.size() > 1) {
				System.out.println("?");
				return;
			}
		}
		System.out.println((char)(maxidx+65));
	}
}