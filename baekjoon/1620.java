import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		HashMap<String, String> h1 = new HashMap<>();
		HashMap<String, String> h2 = new HashMap<>();
		String str;
		for(int i=1; i<=n; i++) {
			str = br.readLine();
			h1.put(str, Integer.toString(i));
			h2.put(Integer.toString(i), str);
		}
		
		for(int i=0; i<m; i++) {
			str = br.readLine();
			if(h1.get(str) != null)
				bw.write(h1.get(str)+"\n");
			else
				bw.write(h2.get(str)+"\n");
		}
		bw.close();
	}
}