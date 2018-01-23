import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 1; t < 11; t++) {
			int len = Integer.parseInt(br.readLine());
			char[] a = new char[len];
			int[] cnt = new int[8];
			a = br.readLine().toCharArray();
			for (int i = 0; i < a.length; i++) {
				switch (a[i]) {
				case '(':
					cnt[0]++;
					break;
				case ')':
					cnt[1]++;
					break;
				case '[':
					cnt[2]++;
					break;
				case ']':
					cnt[3]++;
					break;
				case '{':
					cnt[4]++;
					break;
				case '}':
					cnt[5]++;
					break;
				case '<':
					cnt[6]++;
					break;
				case '>':
					cnt[7]++;
					break;
				}
			}
			if (cnt[0] == cnt[1] && cnt[2] == cnt[3] && cnt[4] == cnt[5] && cnt[6] == cnt[7]) {
				System.out.println("#"+t +" "+1);
			} else {
				System.out.println("#"+t +" "+0);
			}
		}

	}
}