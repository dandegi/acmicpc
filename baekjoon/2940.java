import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<3; i++) {
			String[] s = br.readLine().split(" ");
			int cnt = 0;
			for(int j=0; j<s.length; j++) {
				if(s[j].equals("1")) {
					cnt++;
				}
			}
			switch(cnt) {
			case 0: {
				System.out.println("D");
				break;
			}
			case 3: {
				System.out.println("A");
				break;
			}
			case 2: {
				System.out.println("B");
				break;
			}
			case 1: {
				System.out.println("C");
				break;
			}
			case 4: {
				System.out.println("E");
				break;
			}
			}
		}
	}
}