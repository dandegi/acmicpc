import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int [] array = new int[5];
		put(array);
		go(array);
	}
	public static void put(int [] array) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] s = br.readLine().split(" ");
		for(int i=0; i<5; i++) {
			array[i] = Integer.parseInt(s[i]);
		}
	}
	public static void swap(int [] array) {
			int i = 0;
			for (int j=1; j<5; j++) {
					if (array[i]>array[j]) {
						int a = array[i];
						array[i] = array[j];
						array[j] = a;
							System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);
					}
					i++;
			}
	}
	public static void go(int [] array) {
		while (true) {
			if(array[0]==1&&array[1]==2&&array[2]==3&&array[3]==4) {
				break;
			}
			swap(array);
			}
	}
}