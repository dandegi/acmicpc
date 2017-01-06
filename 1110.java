import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String ns = s;
		String sss = "";
		int ss = 0;
		String n = s;
		int count = 0;
		if (Integer.parseInt(n) < 10) {
			String m = n;
			n = "";
			n += 0;
			n += m;
			ns = n;
		}
		do {
			int a = n.charAt(0) - 48;
			int b = n.charAt(1) - 48;
			ss = a + b;
			n = "";
			n += b;
			n += ss%10;

			count++;
		} while (n.equals(ns) == false);
		System.out.println(count);
	}
}