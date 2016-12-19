import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[5][5];
		int[] array1 = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				array[i][j] = sc.nextInt();
				
			}
			
		}
		
		for (int i = 0; i < 5; i++) {
			
			max = Integer.MIN_VALUE;
			
			for (int j = 0; j < 5; j++) {
				
				if (array[i][j] > max) {
					
					max = array[i][j];
					array1[i] = max;
					
				}
				
			}
		}
		
		for (int i=0; i<5; i++) {
			
			if(array1[i]<min) {
				
				min = array1[i];
				
			}
			
		}
		System.out.println(min);
	}
}