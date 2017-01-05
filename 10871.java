import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(s[0]);
		int x = Integer.parseInt(s[1]);
		int [] arr = new int[n];
		String [] ss = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(ss[i]) < x) {
				sb.append(Integer.parseInt(ss[i])+" ");
			}
		}
		
		System.out.println(sb);
	}
}