import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int size = 10001;
	static boolean[] p = new boolean[size];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		era();
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			gold(Integer.parseInt(br.readLine()));
		}
		
	}
	
	static void gold(int n) {
		int i, j, mid = n/2;
		for(i=j=mid; i<=n; i--, j++) {
			if(!p[i] && !p[j])
				break;
		}
		System.out.println(i + " " + j);
	}
	
	static void era() {
		for(int i=2; i*i<size; i++) {
			if(!p[i])
				for(int j=i*i; j<size; j+=i) {
					p[j] = true;
				}
		}
		p[1] = true;
	}
}