
public class Main {
	public static void main(String[] args) throws IOException {
		//플로이드 알고리즘 - 모든점의 최단거리를 찾는 알고리즘
		//1에서 1로 가는경우는 없으므로 0으로 이중배열을 초기화, 연결이 되어있지않은 배열칸은 나올수있는 최대의 수로 초기화
		//k = 지나가는 정점, i = 출발점, j = 도착점
		
		for (int k = 1; k <= n; k++) {

			for (int i = 1; i <= n; i++) {

				for (int j = 1; j <= n; j++) {

					if (d[i][j] > d[i][k] + d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
					}

				}
			}
		}
	}
}