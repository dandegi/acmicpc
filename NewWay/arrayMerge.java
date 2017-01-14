
public class Main {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 3, 5, 7, 9, 14, 15 };
		int[] arr2 = new int[] { 2, 4, 6, 8, 10, 11, 12, 13 };
		int[] ans = new int[arr1.length + arr2.length];

		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < ans.length; i++) {
			if (arr1.length <= idx1) {
					ans[i] = arr2[idx2];
					idx2++;
			} else if (arr2.length <= idx2) {
					ans[i] = arr1[idx1];
					idx1++;
			} else if (arr1[idx1] < arr2[idx2]) {
				ans[i] = arr1[idx1];
				idx1++;
			} else {
				ans[i] = arr2[idx2];
				idx2++;
			}
			System.out.println(ans[i]);
		}
	}
}