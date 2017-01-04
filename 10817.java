import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] s = br.readLine().split(" ");
		int a, b, c;
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		c = Integer.parseInt(s[2]);
		
		if(a>b && a<c) {
			System.out.println(a);
		} else if (b>a && b<c) {
			System.out.println(b);
		} else if(c>a && c<b) {
			System.out.println(c);
		} else if(a<b && a>c) {
			System.out.println(a);
		} else if(b<a && b>c) {
			System.out.println(b);
		} else if(c<a && c>b) {
			System.out.println(c);
		} else if(a==b && b==c) {
			System.out.println(a);
		} else if(a==b && a>c) {
			System.out.println(a);
		} else if(a==b && a<c) {
			System.out.println(a);
		} else if(a==c && a<b) {
			System.out.println(a);
		} else if(a==c && a>b) {
			System.out.println(a);
		} else if(b==c && a>b) {
			System.out.println(b);
		} else if(b==c && a<b) {
			System.out.println(b);
		}
	}
}