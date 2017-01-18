import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> idx = new Stack<Integer>();
//		int n = Integer.parseInt(br.readLine().trim());
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		StringBuilder sb = new StringBuilder();
//		String[] s = br.readLine().split(" ");
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		stack.push(arr[1]);
		idx.push(1);
		sb.append(0).append(" ");
		for (int i = 2; i <= n; i++) {
			if (arr[i] > stack.peek()) {
				while (arr[i] > stack.peek()) {
					stack.pop();
					idx.pop();
					if(stack.isEmpty()) {
						break;
					}
				}
				if(stack.isEmpty()) {
					sb.append(0).append(" ");
				} else {
					sb.append(idx.peek()).append(" ");
				}
				stack.push(arr[i]);
				idx.push(i);
			} else {
				sb.append(idx.peek()).append(" ");
				stack.push(arr[i]);
				idx.push(i);
			}
		}
		System.out.println(sb);
	}
}