import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = new int[26];
		String s = sc.nextLine();
		for (int i=0; i<array.length; i++) {
			array[i] = -2;
		}
		for (int i=0; i<s.length(); i++) {
			if(array[(int)s.charAt(i)-97]==-2) {
			array[(int)s.charAt(i)-97] = i;
			}
		}
		for (int i=0; i<array.length; i++) {
			if (array[i]==-2) {
				array[i] = -1;
			}
			System.out.print(array[i]+" ");
		}
	}
}
