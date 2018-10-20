import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int n;
	static int[] a;
	static int[] op;
	static boolean[] visit = new boolean[10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idx = 0;
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		String[] s = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		op = new int[n];
		s = br.readLine().split(" ");
		for(int i=0; i<4; i++) {
			int cnt = Integer.parseInt(s[i]);
			for(int j=0; j<cnt; j++) {
				op[idx++] = i+1;
			}
		}
		
		dfs(0, 1, a[0], 0);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void dfs(int v, int idx, int num, int len) {
		int res = 0;
		
		if(len==n-1) {
			if(num > max)
				max = num;
			if(num<min)
				min = num;
		} else {
			for(int i=0; i<n-1; i++) {
				if(!visit[i]) {
					switch(op[i]) {
					case 1:
						res = num + a[idx];
						break;
					case 2:
						res = num - a[idx];
						break;
					case 3:
						res = num * a[idx];
						break;
					case 4:
						res = num / a[idx];
						break;
					}
					visit[i] = true;
					dfs(i, idx+1, res, len + 1);
				}
			}
		}
		visit[v] = false;
	}
}