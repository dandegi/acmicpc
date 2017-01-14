import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[(123456*2)+1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<=Math.sqrt((123456*2)); i++) {
			if(i==1) {
				continue;
			}
			for(int j=i+i; j<=(123456*2); j+=i) {
					arr[j]++;
			}
		}
		while(true) {
			int t = Integer.parseInt(br.readLine().trim());
			int cnt = 0;
			if(t == 0) {
				break;
			}
			for(int i=t+1; i<=(2*t); i++) {
				if(arr[i] == 0) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}