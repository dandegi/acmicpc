import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter o = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		String[] s;
		while(n-- > 0) {
			s = br.readLine().split(" ");
			if(s[1].equals("enter"))
				set.add(s[0]);
			else
				set.remove(s[0]);
		}
		s = set.toArray(new String[set.size()]);
		Arrays.sort(s);
		for(int i=s.length-1; i>=0; i--) {
			o.write(s[i]+"\n");
		}
		o.close();
	}
}