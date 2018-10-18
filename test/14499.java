import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] dice = new int[6];
	static int[] dx = {0, 0, 0, -1, 1};      // 1-동 2-서 3-북 4-남
	static int[] dy = {0, 1, -1, 0, 0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int x = Integer.parseInt(s[2]);
		int y = Integer.parseInt(s[3]);
		int o = Integer.parseInt(s[4]);

		int[][] map = new int[n][m];
		
		for(int i=0; i<n; i++) {
			s = br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(s[j]);
			}
		}
		s = br.readLine().split(" ");
		for(int i=0; i<o; i++) {
			int order = Integer.parseInt(s[i]);
			int nx = x + dx[order];
			int ny = y + dy[order];
			if(nx<n && 0<=nx && ny<m && ny>=0) {
				change(order);
				if(map[nx][ny] == 0) {
					map[nx][ny] = dice[2];
				} else {
					dice[2] = map[nx][ny];
					map[nx][ny] = 0;
				}
				x = nx;
				y = ny;
				System.out.println(dice[0]);
			}
			
		}
		
	}
	
	public static void change(int order) {
		int[] temp = dice.clone();
		switch(order) {
		case 1:
			dice[4] = temp[0];
			dice[0] = temp[5];
			dice[5] = temp[2];
			dice[2] = temp[4];
			break;
			
		case 2:
			dice[5] = temp[0];
			dice[2] = temp[5];
			dice[4] = temp[2];
			dice[0] = temp[4];
			break;
			
		case 3:
			dice[1] = temp[0];
			dice[2] = temp[1];
			dice[3] = temp[2];
			dice[0] = temp[3];
			break;
			
		case 4:
			dice[3] = temp[0];
			dice[0] = temp[1];
			dice[1] = temp[2];
			dice[2] = temp[3];
			break;
		}
	}
}