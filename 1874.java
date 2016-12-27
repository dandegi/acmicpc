import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {
	int top = 1;
	int high = 1;
	int[] st;

	public Stack(int n) {
		st = new int[n];
	}

	char push(int x) {
		st[top++] = x;
		high++;
		return '+';
	}

	char pop() {
		st[--top] = 0;
		return '-';
	}
}

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder bb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		boolean bool = true;
		Stack stack = new Stack(n + 1);
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			for (int j = stack.high; j <= m; j++) {
				bb.append(stack.push(j));
			}
			if (m == stack.st[stack.top - 1]) {
				bb.append(stack.pop());
			} else {
				bool = false;
				System.out.println("NO");
				break;
			}
		}
		if (bool) {
			for (int i = 0; i < bb.length(); i++) {
				System.out.println(bb.charAt(i));
			}
		}
	}
}