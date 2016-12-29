import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Queue {
	int[] que;
	int fr, rear;

	public Queue(int x) {
		que = new int[x];
		fr = 0;
		rear = -1;
	}

	void push(int x) {
		rear++;
		que[rear] = x;
	}

	int pop() {
		if(fr-1==rear) {
			return -1;
		} else {
			int a = que[fr];
			que[fr] = 0;
			fr++;
			return a;
		}
	}

	int size() {
		int size = 0;
		for(int i=0; i<que.length; i++) {
			if(que[i]!=0) {
				size++;
			}
		}
		return size;
	}

	int empty() {
		if (fr - 1 == rear) {
			return 1;
		} else {
			return 0;
		}
	}

	int front() {
		if (fr - 1 == rear) {
			return -1;
		} else {
			return que[fr];
		}
	}

	int back() {
		if (fr - 1 == rear) {
			return -1;
		} else {
			return que[rear];
		}
	}
}

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue qu = new Queue(n);
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			if (s[0].equals("push")) {
				qu.push(Integer.parseInt(s[1]));
			}
			if (s[0].equals("pop")) {
				System.out.println(qu.pop());
			}
			if (s[0].equals("size")) {
				System.out.println(qu.size());
			}
			if (s[0].equals("empty")) {
				System.out.println(qu.empty());
			}
			if (s[0].equals("front")) {
				System.out.println(qu.front());
			}
			if (s[0].equals("back")) {
				System.out.println(qu.back());
			}
		}
	}
}