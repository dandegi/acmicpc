import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int max(int a, int b) {
		return a>b? a:b;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int ans = 0, cnt = 0;
		int[] a = new int[n];
		String[] s = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		
		for(int i=0; i<n; i++) {
			cnt = 0;
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j])
					cnt++;
				else
					break;
			}
			ans = max(cnt, ans);
		}
		System.out.println(ans);
	}
}