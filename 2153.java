import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int [] array = new int[53];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a = s.length();
		for (int i=0; i<a; i++){
		if(97<=(int)s.charAt(i)&&(int)s.charAt(i)<=122) {
			array[(int)s.charAt(i)-96]++;
		}
		if(65<=(int)s.charAt(i)&&(int)s.charAt(i)<=90) {
			array[(int)s.charAt(i)-38]++;
		}
	}
		int sum = 0;
		for (int i=1; i<53; i++) {
			if(array[i]>=1) {
				for(int j=0; j<array[i];j++) {
					sum += i;
				}
			}
		}
		boolean prime = true;
		for (int i=2; i<sum; i++) {
			if (sum%i==0) {
				prime = false;
				System.out.println("It is not a prime word.");
				break;
			}
		}
		if(prime) {
			System.out.println("It is a prime word.");
		}
	}
}