import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		s = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			arr1[i] = Integer.parseInt(s[i]);
		}
		
		s = br.readLine().split(" ");
		for(int i=0; i<m; i++) {
			arr2[i] = Integer.parseInt(s[i]);
		}
		
//		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
//		for(int i=0; i<n; i++) {
//			q.add(arr1[i]);
//		}
//		for(int i=0; i<m; i++) {
//			q.add(arr2[i]);
//		}
//		
//		while(!q.isEmpty()) {
//			sb.append(q.poll()).append(" ");
//		}
		
		int[] ans = new int[arr1.length + arr2.length];

		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < ans.length; i++) {
			if (arr1.length <= idx1) {
				ans[i] = arr2[idx2];
				idx2++;
			} else if (arr2.length <= idx2) {
				ans[i] = arr1[idx1];
				idx1++;
			} else if (arr1[idx1] < arr2[idx2]) {
				ans[i] = arr1[idx1];
				idx1++;
			} else {
				ans[i] = arr2[idx2];
				idx2++;
			}
		}
		
		for(int i=0; i<ans.length; i++) {
			sb.append(ans[i]).append(" ");
		}
		System.out.println(sb);
	}
}