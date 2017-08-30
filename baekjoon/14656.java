import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		String[] s = br.readLine().split(" ");
		for(int i=1; i<=n; i++) {
			if(Integer.parseInt(s[i-1]) != i) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}