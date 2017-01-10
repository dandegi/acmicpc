
public class Main {
	public static void main(String[] args) {
		
	}
//10자리 100자리 1000자리 식으로 끊는 법
public static int d(int n) {
		int sum = n;
		while(n!=0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
}