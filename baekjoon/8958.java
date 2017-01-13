import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		char[] ox;
		for(int i=0; i<t; i++) {
			String s = br.readLine();
			ox = new char[s.length()];
			for(int j=0; j<s.length(); j++) {
				ox[j] = s.charAt(j);
			}
			int sum = 0;
			int cnt = 0;
			for(int j=0; j<ox.length; j++) {
				if(ox[j] == 'X') {
					cnt = 0;
				} else {
					cnt ++;
					sum += cnt;
				}
			}
			System.out.println(sum);
		}
	}
}