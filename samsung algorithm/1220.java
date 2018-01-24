import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t=1; t<11; t++) {
			int size = Integer.parseInt(br.readLine());
			int[][] a = new int[100][100];
			for(int i=0; i<100; i++) {
				String[] s = br.readLine().split(" ");
				for(int j=0; j<100; j++) {
					a[i][j] = Integer.parseInt(s[j]);
				}
			}
			int cnt = 0;
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					if(a[j][i]==1) {
						for(int k=j; k<100; k++) {
							if(a[k][i] == 2) {
								cnt++;
								j=k;
								break;
							}
						}
					}
				}
			}
			System.out.println("#"+t+" "+cnt);
		}
	}
}