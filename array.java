import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[52];
		for (int i = 0; i < 52; i++) {
			char ch = sc.next().charAt(0);
			if ((int) ch == 48) {
				break;
			}
			if (65 <= (int) ch && (int) ch <= 90) {
				array[(int) ch - 65] += 1;
			}
			if (97 <= (int) ch && (int) ch <= 122) {
				array[(int) ch - 71] += 1;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 65) + "는" + " " + array[i]);
		}
		for (int i = 26; i < 52; i++) {
			System.out.println((char) (i + 71) + "는" + " " + array[i]);
		}
	}
}