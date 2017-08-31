import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		HashMap<String, String> map = new HashMap<String, String>();
		HashSet<String> set = new HashSet<String>();
		String str;
		while (n-- > 0) {
			str = br.readLine();
			map.put(str, str);
		}
		
		while (m-- > 0) {
			str = br.readLine();
			if (map.get(str) != null) {
				set.add(str);
			}
		}
		s = set.toArray(new String[set.size()]);
		Arrays.sort(s);
		bw.write(Integer.toString(s.length)+"\n");
		for(int i=0; i<s.length; i++) {
			bw.write(s[i]+"\n");
		}
		bw.close();
	}
}