import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			StringBuilder sb = new StringBuilder();
			String[] s = br.readLine().split(" ");
			sb.append(s[0]+"\n");
			int size = Integer.parseInt(s[1]);
			String ss = br.readLine();
			ss = ss.replace("ZRO", "0").replace("ONE", "1").replaceAll("TWO", "2").replace("THR", "3").replace("FOR", "4")
			.replace("FIV", "5").replace("SIX", "6").replace("SVN", "7").replace("EGT", "8").replace("NIN", "9");
			int idx = 0;
			int[] arr = new int[size];
			for(int i=0; i<ss.length(); i++) {
				if(ss.charAt(i) == ' ') {
					continue;
				}
				arr[idx++] = ss.charAt(i)-48;
			}
			Arrays.sort(arr);
			for(int i=0; i<arr.length; i++) {
				switch(arr[i]) {
				case 0:
					sb.append("ZRO ");
					break;
				case 1:
					sb.append("ONE ");
					break;
				case 2:
					sb.append("TWO ");
					break;
				case 3:
					sb.append("THR ");
					break;
				case 4:
					sb.append("FOR ");
					break;
				case 5:
					sb.append("FIV ");
					break;
				case 6:
					sb.append("SIX ");
					break;
				case 7:
					sb.append("SVN ");
					break;
				case 8:
					sb.append("EGT ");
					break;
				case 9:
					sb.append("NIN ");
					break;
				}
			}
			System.out.println(sb);
			
		}
	}
}
