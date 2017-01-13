import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hset = new HashSet<String>();
		int n = Integer.parseInt(br.readLine().trim());
		for(int i=0; i<n; i++) {
			hset.add(br.readLine());
		}
		String[] s = new String[hset.size()];
		s = hset.toArray(s);
		
		Arrays.sort(s, new Sort());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length; i++) {
			sb.append(s[i]).append("\n");
		}
		System.out.println(sb);
	}
}

class Sort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length()<o2.length()) {
			return -1;
		} else if(o1.length()>o2.length()) {
			return 1;
		} else if(o1.length() == o2.length()) {
			return o1.compareTo(o2);
		} else {
			return 0;
		}
	}
	
}