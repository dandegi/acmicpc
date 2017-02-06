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
		int n = Integer.parseInt(br.readLine());
		int[][] d = new int[n + 1][n + 1];

		int m = Integer.parseInt(br.readLine());
		
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(i == j) {
					d[i][j] = 0;
					continue;
				}
				d[i][j] = 10000000;
				
//				d[i][j] = (i == j) ? 0 : 100000;
			}
		}
		
		while (m-- > 0) {
			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			int v = Integer.parseInt(s[2]);
			
			if(d[x][y] > v) {
				d[x][y] = v;
			}
//			d[x][y] = Math.min([x][y], v);
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
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				bw.write(d[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.close();
	}
}