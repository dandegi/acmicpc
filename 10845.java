import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class DequeClass {
	Queue<Integer> qu;

	public DequeClass() {
		qu = new LinkedList<>();
	}

	public void push(int x) {
		qu.add(x);
	}

	public int pop() {
		if (size() == 0) {
			return -1;
		} else {
			return qu.remove();
		}
	}

	public int size() {
		return qu.size();
	}

	public int empty() {
		if (qu.isEmpty() == true) {
			return 1;
		} else {
			return 0;
		}

	}

	public int front() {
		if (size() == 0) {
			return -1;
		} else {
			return qu.peek();
		}
	}

	public int back() {
		if (size() == 0) {
			return -1;
		}
		else {
			return (int) qu.toArray()[qu.size()-1];
		}
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
			if (s[0].equals("front")) {
				System.out.println(dec.front());
			}
			if(s[0].equals("back")) {
				System.out.println(dec.back());
			}
		}
	}
}