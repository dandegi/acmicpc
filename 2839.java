import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		int remainder = 0;

		result += a / 5;
		if (a % 5 == 1) {
			result -= 1;
			remainder = a % 5 + 5;
			result += remainder / 3;
		} else if (a % 5 == 2) {

			if (a % 3 != 0) {
				result -= 2;
				if (result <= 0) {
					result = -1;
				} else if (result > 0) {
					remainder = a % 5 + 10;
					result += remainder / 3;
				}
			}
			if (a % 3 == 0) {
				if (result >= 3) {
					result -= 2;
					remainder = a % 5 + 10;
					result += remainder / 3;
				}
				if (result < 3) {
					result = a / 3;
				}
			}
		} else if (a % 5 == 3) {
			result += 1;
		} else if (a % 5 == 4) {
			if (a > 5) {
				result -= 1;
				remainder = a % 5 + 5;
				result += remainder / 3;
			}
			if (a < 5) {
				result = -1;
			}
		}
		System.out.println(result);
	}
}