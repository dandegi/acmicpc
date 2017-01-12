import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[8];
		int[] ans = new int[8];
		int [] ans2 = new int[8];
		int a = 0;
		for(int i=8; i>0; i--) {
			ans2[a] = i;
			a++;
		}
		for(int i=1; i<=8; i++) {
			ans[i-1] = i;
		}
		String[] s = br.readLine().split(" ");
		
		for(int i=0; i<8; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int cnt = 0;
		for(int i=0; i<8; i++) {
			if(arr[i] != ans[i]) {
				cnt++;
			}
		}
		int cnt2 = 0;
		for(int i=0; i<8; i++) {
			if(arr[i] != ans2[i]) {
				cnt2++;
			}
		}
		if(cnt == 0) {
			System.out.println("ascending");
		} else if(cnt2 == 0) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}