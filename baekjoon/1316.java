import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		char[] arr;
		boolean[] bool;
		int cnt = n;
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			arr = new char[s.length()];
			bool = new boolean[26];
			
			for(int j=0; j<26; j++) {
				bool[j] = false;
			}
			
			for (int j = 0; j < s.length(); j++) {
				arr[j] = s.charAt(j);
			}
			
			bool[((int)arr[0]) - 97] = true;
			
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] == arr[j - 1]) {
					continue;
				} else if (arr[j] != arr[j - 1]) {
					if (bool[((int)arr[j]) - 97] == true) {
						cnt--;
						break;
					} else {
						bool[((int) arr[j]) - 97] = true;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}