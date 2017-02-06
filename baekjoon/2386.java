import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		
		while (true) {
			int cnt = 0;
			char[] str = br.readLine().toCharArray();
			if(str[0] == '#') {
				break;
			}
			
			for(int i=2; i<str.length; i++) {
				if((int)str[0] == (int)str[i] || (int)str[0] == (int)str[i]+32) {
					cnt++;
				}
			}
			
			ans.append(str[0] + " " + cnt + "\n");
		}
		System.out.print(ans);

	}
}