import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

class DequeClass {
	Deque<Integer> deque;
	
	public DequeClass() {
		deque = new LinkedList<>();
	}

	public void push_front(int x) {
		deque.addFirst(x);
	}

	public void push_back(int x) {
		deque.addLast(x);
	}

	public int pop_front() {
		if(size()==0) {
			return -1;
		} else {
		return deque.pop();
		}
	}

	public int pop_back() {
		if(size() == 0) {
			return -1;
		} else {
		return deque.removeLast();
		}
	}

	public int size() {
		return deque.size();
	}

	public int empty() {
		if(deque.isEmpty()==true) {
			return 1;
		} else {
			return 0;
		}
		
	}

	public int front() {
		if(size()==0) {
			return -1;
		} else {
		return deque.getFirst();
		}
	}

	public int back() {
		if(size() == 0) {
			return -1;
		} else {
		return deque.getLast();
		}
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		DequeClass dec = new DequeClass();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String [] s = br.readLine().split(" ");
			if(s[0].equals("push_front")) {
				dec.push_front(Integer.parseInt(s[1]));
			}
			if(s[0].equals("push_back")) {
				dec.push_back(Integer.parseInt(s[1]));
			}
			if(s[0].equals("front")) {
				System.out.println(dec.front());
			}
			if(s[0].equals("back")) {
				System.out.println(dec.back());
			}
			if(s[0].equals("pop_front")) {
				System.out.println(dec.pop_front());
			}
			if(s[0].equals("pop_back")) {
				System.out.println(dec.pop_back());
			}
			if(s[0].equals("empty")) {
				System.out.println(dec.empty());
			}
			if(s[0].equals("size")) {
				System.out.println(dec.size());
			}
		}
	}
}