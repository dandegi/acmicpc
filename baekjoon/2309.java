import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine().trim());
		}
		for (int i = 1; i < 9; i++) {
			int temp = i;
			int val = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (val < arr[j]) {
					temp = j;
					arr[j + 1] = arr[j];
				}
			}
			arr[temp] = val;
		}
		int ans = 100;
		int ii = 0;
		int jj = 0;
		StringBuilder sb = new StringBuilder();
			//난쟁이 1 : i, 난쟁이 2 : j 두명 빼고 반복문을 돌린다.
			int sum = 0;
			out1: for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (i == j) {
						continue;
					}
					for (int z = 0; z < 9; z++) {
						if (z == i || z == j) {
							continue;
						} else {
							sum += arr[z];
						}
					}
					if (sum == ans) {
						ii = i;
						jj = j;
						break out1;
					} else {
						sum = 0;
					}
				}
			}
		for(int i=0; i<arr.length; i++) {
			if(i==ii || i==jj) {
				continue;
			}
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb);
	}
}