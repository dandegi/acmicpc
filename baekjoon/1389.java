import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	//플로이드 알고리즘 - 모든점의 최단거리를 찾는 알고리즘
	//1에서 1로 가는경우는 없으므로 0으로 이중배열을 초기화, 연결이 되어있지않은 배열칸은 나올수있는 최대의 수로 초기화
	//k = 지나가는 정점, i = 출발점, j = 도착점

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		int[][] d = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				d[i][j] = (i == j) ? 0 : 100000;
			}
		}
		
		while(m-- > 0) {
			
			s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			
			d[x][y] = 1;
			d[y][x] = 1;
			
		}
		
		for (int k = 1; k <= n; k++) {

			for (int i = 1; i <= n; i++) {

				for (int j = 1; j <= n; j++) {

					if (d[i][j] > d[i][k] + d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
					}

				}
			}
		}
		
		int[] ans = new int[n+1];
		int min = Integer.MAX_VALUE;
		int idx = 0;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				ans[i] += d[i][j];
			}
			
			if(min>ans[i]) {
				min = ans[i];
				idx = i;
			}
			
		}
		
		System.out.println(idx);
	}
}