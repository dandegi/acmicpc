import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> idx = new Stack<Integer>();
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		stack.push(arr[1]);
		idx.push(0);
		idx.push(1);
		sb.append(0).append(" ");
		for (int i = 2; i <= n; i++) {
			if (arr[i] > stack.peek()) {
				while (arr[i] > stack.peek()) {
					stack.pop();
					idx.pop();
					if (stack.isEmpty()) {
						break;
					}
				}
			}
			sb.append(idx.peek()).append(" ");
			stack.push(arr[i]);
			idx.push(i);
		}
		System.out.println(sb);
	}
}