import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c, d, p, m, n;
		String[] s = br.readLine().split(" ");
		String [] ss = br.readLine().split(" ");
		int[] arr1 = new int[1000];
		int[] arr2 = new int[1000];
		
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		c = Integer.parseInt(s[2]);
		d = Integer.parseInt(s[3]);
		
		p = Integer.parseInt(ss[0]);
		m = Integer.parseInt(ss[1]);
		n = Integer.parseInt(ss[2]);
		
		int ab = a+b;
		int cd = c+d;
		for(int i=1; i<=a; i++) {
			for(int j=i; j<1000; j+=ab) {
				arr1[j] = 1;
			}
		}
		for(int i=1; i<=c; i++) {
			for(int j=i; j<1000; j+=cd) {
				arr2[j] = 1;
			}
		}
		System.out.println(arr1[p]+arr2[p]);
		System.out.println(arr1[m]+arr2[m]);
		System.out.println(arr1[n]+arr2[n]);
	}
}