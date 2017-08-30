import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] r1 = new int[n];
		int[] r2 = new int[n];
		int sum = 0;
		
		String[] s = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			r1[i] = Integer.parseInt(s[i]);
			if(r1[i] < 0) {
				r1[i] *= -1;
			}
			sum += r1[i];
		}
		
		s = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			r2[i] = Integer.parseInt(s[i]);
			if(r2[i] < 0) {
				r2[i] *= -1;
			}
			sum += r2[i];
		}
		
		System.out.println(sum);
	}
}