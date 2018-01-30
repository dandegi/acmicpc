import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 1; t < 11; t++) {
			Stack<Character> stack = new Stack<>();
			Stack<Integer> st = new Stack<>();
			StringBuilder sb = new StringBuilder();
			int len = Integer.parseInt(br.readLine());
			char[] arr = br.readLine().toCharArray();
			char[] post;
			String temp;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != '+')
					sb.append(arr[i]);
				else {
					if (stack.isEmpty())
						stack.push(arr[i]);
					else {
						sb.append(stack.pop());
						stack.push(arr[i]);
					}
				}
			}
			while (!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			temp = sb.toString();
			post = temp.toCharArray();
			for (int i = 0; i < post.length; i++) {
				if (post[i] != '+') {
					st.push((int)post[i]-48);
				} else {
					int a1 = st.pop();
					int a2 = st.pop();
					st.push(a1 + a2);
				}
			}
			System.out.println("#" + t + " " + st.pop());
		}
	}
}
