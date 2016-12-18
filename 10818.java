import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -1000000;
		int min = 1000000;
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int j = 0; j < array.length; j++) {
			for (int k = j + 1; k < array.length; k++) {
				if (array[j] < array[k]) {
					if(max<array[k]) {
					max = array[k];
					}
				}
				if (array[j] > array[k]) {
					if(max<array[j]) {
					max = array[j];
					}
				}
			}
		}
		for (int j = 0; j < array.length; j++) {
			for (int k = j + 1; k < array.length; k++) {
				if (array[j] > array[k]) {
					if(min>array[k]) {
					min = array[k];
					}
				}
				if (array[j] < array[k]) {
					if(min>array[j]) {
					min = array[j];
					}
				}
	}
}
		System.out.println(min+" "+max);
	}
}