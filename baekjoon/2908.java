import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int[] arr = new int[2];
		for(int i=0; i<2; i++) {
			String temp = "";
			for(int j=s[i].length()-1; j>=0; j--) {
				temp+=s[i].charAt(j);
			}
			arr[i] = Integer.parseInt(temp);
		}
		if(arr[0]>arr[1]) {
			System.out.println(arr[0]);
		} else {
			System.out.println(arr[1]);
		}
	}
}