import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static int[][] map = new int[101][101];
	static int[] X = { 0, -1, 0, 1, 1 };
	static int[] Y = { 1, 0, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); 
		int[][] infoArray = new int[n][4];
		for(int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0; j < 4; j++) {
				infoArray[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		solution(infoArray);
	}
	
	public static void solution(int[][] infoArray) {
		
		for(int i=0; i<infoArray.length; i++) {
			ArrayList<Integer> direction = new ArrayList<>();
			direction.add(infoArray[i][2]);
			
			for(int j=0; j<infoArray[i][3]; j++) {
				int size = direction.size();
			
				for(int k=size-1; k>=0; k--) {
					int n = direction.get(k);
					if(n!=3)
						direction.add(n+1);
					else
						direction.add(0);
				}
			}
			
			drawing(infoArray[i][0], infoArray[i][1], direction);
		}
		
		count();
	}
	
	public static void drawing(int x, int y, ArrayList<Integer> direction) {
		map[y][x] = 1;
		for(int i=0; i<direction.size(); i++) {
			y = y + X[direction.get(i)];
			x = x + Y[direction.get(i)];
			map[y][x] = 1;
		}
	}
	
	public static void count() {
		int res = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(map[i][j] == 1 && map[i+X[0]][j+Y[0]]==1 && map[i+X[3]][j+Y[3]]==1 && map[i+X[4]][j+Y[4]]==1)
					res++;
			}
		}
		System.out.println(res);
	}
}