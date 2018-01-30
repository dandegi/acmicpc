import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t=1; t<11; t++) {
			int tnum = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			Queue<Integer> q = new LinkedList<>();
			for(int i=0; i<8; i++) {
				q.offer(Integer.parseInt(s[i]));
			}
			int cnt = 1;
			while(true) {
				if(q.peek() - cnt <= 0) {
					q.offer(0);
					q.poll();
					break;
				}
				q.offer(q.poll()-cnt++);
				if(cnt > 5)
					cnt = 1;
			}
			System.out.print("#" + tnum + " ");
			while(!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();
		}
	}
}
