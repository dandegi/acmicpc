import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		char[] arr;
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().split(" ");
			arr = new char[s[1].length()];
			for(int j=0; j<s[1].length(); j++) {
				arr[j] = s[1].charAt(j);
			}
			StringBuilder sb = new StringBuilder();
			int r = Integer.parseInt(s[0]);
			for(int j=0; j<arr.length; j++) {
				for(int z=0; z<r; z++) {
					sb.append(arr[j]);
				}
			}
			System.out.println(sb);
		}
	}
}