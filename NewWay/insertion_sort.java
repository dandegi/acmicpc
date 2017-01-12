import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[8];
		String[] s = br.readLine().split(" ");
		for(int i=0; i<8; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		for(int i=1; i<8; i++) {
			int temp = i;
			int val = arr[i];
			
			for(int j=i-1; j>=0; j--) {
				
				if(val < arr[j]) {
					temp = j;
					arr[j+1] = arr[j];
				}
				
			}
			
			arr[temp] = val;
			
			for(int z=0; z<8; z++) {
				System.out.print(arr[z] + " ");
			}
			System.out.println();
		}
		for(int z=0; z<8; z++) {
			System.out.print(arr[z] + " ");
		}
	}
}