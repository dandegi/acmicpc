import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	static int k;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String[] s = br.readLine().split(" ");
			k = Integer.parseInt(s[0]);
			arr = new int[13];
			if(k==0)
				break;
			
			for(int i=1; i<=k; i++) {
				arr[i-1] = Integer.parseInt(s[i]);
			}
			
			for(int i=0; i<k-5; i++) {
				cnt = 1;
				dfs(i, arr[i] + " ");
			}
			
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
		
	}
	
	public static void dfs(int v, String str) {
		if(cnt==6)
			sb.append(str + "\n");
		else {
			for(int i=v+1; i<k; i++) {
				++cnt;
				dfs(i, str + arr[i] + " ");
			}
		}
		--cnt;
	}
}