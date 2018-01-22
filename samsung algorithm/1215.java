import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 1; t < 11; t++) {
			int len = Integer.parseInt(br.readLine());
			char[][] arr = new char[8][8];
			for (int i = 0; i < 8; i++) {
				String s = br.readLine();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			int cnt = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8 - len; j++) {
					String s = "";
					String ss = "";
					String sss = "";
					String ssss = "";
					for (int k = j; k < len + j; k++) {
						s += arr[i][k];
						sss += arr[k][i]; 
					}
					for (int k = (len - 1) + j; k >= j; k--) {
						ss += arr[i][k];
						ssss += arr[k][i];
					}
					if (s.equals(ss)) {
						cnt++;
					}
					if(sss.equals(ssss))
						cnt++;
				}
			}

			System.out.println("#"+t+" "+cnt);
		}
	}
}