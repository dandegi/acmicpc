import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class DequeClass {
	Stack<Integer> stack;

	public DequeClass() {
		stack = new Stack<>();
	}

	public void push(int x) {
		stack.push(x);
	}

	public int pop() {
		if (size() == 0) {
			return -1;
		} else {
			return stack.pop();
		}
	}

	public int size() {
		return stack.size();
	}

	public int empty() {
		if (stack.isEmpty() == true) {
			return 1;
		} else {
			return 0;
		}

	}

	public int top() {
		if(size() == 0) {
			return -1;
		}
		return stack.peek();
	}

}

public class Main {
	public static void main(String[] args) throws IOException {
		DequeClass dec = new DequeClass();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			if (s[0].equals("push")) {
				dec.push(Integer.parseInt(s[1]));
			}
			if (s[0].equals("pop")) {
				System.out.println(dec.pop());
			}
			if (s[0].equals("empty")) {
				System.out.println(dec.empty());
			}
			if (s[0].equals("size")) {
				System.out.println(dec.size());
			}
			if (s[0].equals("top")) {
				System.out.println(dec.top());
			}
		}
	}
}