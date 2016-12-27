import java.util.Scanner;

class Stack {
	int top = 0;
	char [] stack;
	public Stack(int x) {
		stack = new char[x];
	}
	void push(char x) {
		stack[top] = x;
		top++;
	}
	void pop() {
		stack[--top] = 0;
		
	}
	int size() {
		return top;
	}
	int empty() {
		if(top==0) {
			return 1;
		} else {
			return 0;
		}
	}
	char top() {
		if (top==0) {
			return 0;
		} else {
		return stack[top-1];
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<n; i++) {
			Stack st = new Stack(51);
			String s = sc.nextLine();
			for(int j=0; j<s.length(); j++) {
				if(st.top==0) {
					st.push(s.charAt(j));
				} else if (st.stack[st.top-1] == s.charAt(j)) {
					st.push(s.charAt(j));
				}
				if(s.charAt(j)==')'&& st.stack[st.top-1]=='(') {
					st.pop();
				}
			}
			if(st.stack[0]!=0) {
				System.out.println("NO");
			}
			if(st.stack[0]==0) {
				System.out.println("YES");
			}
		}
	}
}