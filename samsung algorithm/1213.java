import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 10;
		while(t-->0) {
			int tnum = Integer.parseInt(br.readLine());
			String find = br.readLine();
			String s = br.readLine();
			
			s = s.replace(find, " ");
			int cnt = 0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == ' ') {
					cnt ++;
				}
			}
			System.out.println("#"+tnum+ " " +cnt);
		}
	}
}