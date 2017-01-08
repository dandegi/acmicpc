import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		
		ST st = new ST();
		String s = Buff.br.readLine();
		int n = Integer.parseInt(s);
		int count = 0;
		for (int i = 0; i < n; i++) {
			st.vs();
			if (st.vsb()) {
				count++;
			}
		}
		System.out.println(count);

	}
	
	static class Buff {
		static BufferedReader br;
		
		Buff() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
	}
}

class ST {
	Stack<Character> stack;
	Main.Buff ma;
	public ST() {
		stack = new Stack<Character>();
		ma = new Main.Buff();
	}

	public void vs() throws IOException {
		stack = new Stack<Character>();
		String ss = ma.br.readLine();
		for (int i = 0; i < ss.length(); i++) {
			if (stack.isEmpty()) {
				stack.add(ss.charAt(i));
			} else {
				if (stack.peek().equals(ss.charAt(i))) {
					stack.pop();
				} else {
					stack.add(ss.charAt(i));
				}
			}
		}
	}

	public boolean vsb() {
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}