import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String sb = "";

		s = s.replace("c=", "a").replace("c-", "a").replace("dz=", "a").replace("d-", "a").replace("lj", "a")
				.replace("nj", "a").replace("s=", "a").replace("z=", "a");
		
		
		// s.replace("c-", "a");
		// s.replace("dz=", "a");
		// s.replace("d-", "a");
		// s.replace("lj", "a");
		// s.replace("nj", "a");
		// s.replace("s=", "a");
		// s.replace("z=", "a");
		System.out.println(s.length());
	}
}