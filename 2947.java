import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int[] array = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		for (int i=0; i<5; i++) {
			array[i] = Integer.parseInt(s[i]);
		}
		for (int i = 0; i <5; i++) {
			int a = 0;
			for (int j = 1; j < 5-i; j++) {
				if(array[a]>array[j]) {
					int t = array[a];
					array[a] = array[j];
					array[j] = t;
					System.out.print(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);
					System.out.println();
				}
				a++;
			}
		}
	}
}