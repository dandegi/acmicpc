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
			for(int i=0; i<arr.length; i++) {
				int p = priority(arr[i]);
				switch(arr[i]) {
				case '+':
				case '*':
					while(!stack.isEmpty() && priority(stack.peek()) >= p) 
						sb.append(stack.pop());
					stack.push(arr[i]);
					break;
				default:
					sb.append(arr[i]);
				}
			}
			while(!stack.isEmpty())
				sb.append(stack.pop());
			String s = sb.toString();
			char[] post = s.toCharArray();
			for(int i=0; i<post.length; i++) {
				int a1 = 0, a2 = 0;
				switch(post[i]) {
				case '+':
					a1 = st.pop();
					a2 = st.pop();
					st.push(a1+a2);
					break;
				case '*':
					a1 = st.pop();
					a2 = st.pop();
					st.push(a1*a2);
					break;
				default :
					st.push((int)post[i]-48);
				}
			}
			System.out.println("#"+t+" "+st.pop());
		}
	}
	
	public static int priority(char c) {
		switch(c) {
		case '+':
			return 1;
		case '*':
			return 2;
		}
		return -1;
	}
}
