import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1001];
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i<10) {
//				System.out.println(i);
				arr[i]++;
			} else if(i>=10 && i<100) {
//				System.out.println(i);
				arr[i]++;
			} else if(i>100 && i<1000) {
				int temp = i/100;
				int temp2 = (i%100)/10;
				int temp3 = i%10;
				if(temp2-temp == temp3-temp2) {
//					System.out.println(i);
					arr[i]++;
				}
			}
		}
		int cnt = 0;
		for(int i=0; i<=n; i++) {
			if(arr[i] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}