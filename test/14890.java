import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] map;
	static int n, l;
	static int[] height;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		l = Integer.parseInt(s[1]);
		map = new int[n*2][n];
		int ans = n*2;
		
		for (int i = 0; i < n; i++) {
			s = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		for(int i=n; i<n*2; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = map[j][i-n];
			}
		}
		
		for(int i=0; i<n*2; i++) {
			int target = map[i][0];
			height = new int[11];
			height[target] = 1;
			int j=1;
			while(j<n) {
				int next = map[i][j];
				if(!vaildheight(target, next)) {
					--ans;
					break;
				}
				if (target != next) {
					if(target < next) {
						if(!high(target, next)) {
							--ans;
							break;
						}
					} else {
						if(!low(i, j, target, next)) {
							--ans;
							break;
						}
						j += l -1;
					}
					target = next;
				} else {
					height[target]++;
				}
				j++;
			}
		}
		System.out.println(ans);
	}

	public static boolean low(int i, int j, int target, int next) {
		for (int k=0; k<l; k++) {
			if(j+k == n) {
				break;
			}
			if(map[i][j+k] == next) {
				height[next]++;
			}
		}
		if(height[next] < l) {
			return false;
		}
		height[next] -= l;
		return true;
	}
	
	public static boolean high(int target, int next) {
		if(height[target] < l) {
			return false;
		}
		height[target] = 0;
		height[next] = 1;
		return true;
	}
	
	public static boolean vaildheight(int a, int b) {
		int gap = Math.abs(a-b);
		if(gap > 1) {
			return false;
		}
		return true;
	}
}