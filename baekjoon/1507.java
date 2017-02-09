import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
//	입력에서 이미 모든 거리의 최단거리가 주어져있기때문에 플로이드를 역이로 생각해서 풀어야한다.
//	i-k-j 가 가능한 i-j 가 있다면 i-j 인 간선은 필요가 없다. 왜냐하면 i-j 는 i-k, k-j 로 표현이 가능하고,
//	같은 거리로 더 많은 도시를 갈 수 있도록 유지되기 때문이다.
//	
//	불가능한 경우는 d[i][j] > d[i][k] + d[k][j] 일때이다 최단거리가 이미 주어졌는데 더 작은게나올수가 없다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] d = new int[n+1][n+1];
		boolean[][] c = new boolean[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=1; j<=n; j++) {
				d[i][j] = Integer.parseInt(s[j-1]);
			}
		}
		
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {

					if(i==k || j==k || i==j) {
						continue;
					}
					
					if(d[i][k]+d[k][j] < d[i][j]){
						System.out.println(-1);
						return;
					}
					
					if (d[i][j] == d[i][k] + d[k][j]) {
						c[i][j] = true;
					}

				}
			}
		}
		
//		j가 i부터 시작하는 이유는 반틈만 더하면 되기때문, 양방향으로 안더해도 된다.
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				if(!c[i][j]) {
					ans += d[i][j];
				}
			}
		}
		System.out.println(ans);
	}
}