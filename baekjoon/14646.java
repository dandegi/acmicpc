import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		int max = 0;
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n * 2 + 1];
		
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < n * 2; i++) {
			int temp = Integer.parseInt(s[i]);
			if(a[temp] != 0) {
				a[temp] = 0;
				cnt--;
			} else {
				a[temp] ++;
				cnt++;
				if(cnt >= max) {
					max = cnt;
				}
			}
		}
		System.out.println(max);

	}
}