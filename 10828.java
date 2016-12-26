import java.util.Scanner;

class Stack {
	int i = 0;
	int[] array = new int[10001];

	void push(int x) {
		array[i] = x;
		i++;
	}

	void pop() {
		if (array[0] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(array[i-1]);
			array[i-1] = 0;
			i--;
		}
	}

	void size() {
		int count = 0;
		for (int j = 0; j < 10001; j++) {
			if (array[j] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	void empty() {
		if (array[0] == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	void top() {
		if (array[0] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(array[i-1]);
		}
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		int n = sc.nextInt();
		for (int i=0; i<=n; i++) {
			String [] s = sc.nextLine().split(" ");
			if(s[0].equals("push")) {
				st.push(Integer.parseInt(s[1]));
			}
			if(s[0].equals("pop")) {
				st.pop();
			}
			if(s[0].equals("size")) {
				st.size();
			}
			if(s[0].equals("empty")) {
				st.empty();
			}
			if(s[0].equals("top")) {
				st.top();
			}
		}
	}
}