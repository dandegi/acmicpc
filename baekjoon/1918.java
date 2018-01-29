import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//피연산자(a,b,c)는 출력한다. 
//연산자는 앞 연산자(스택의 맨 위)를 살펴서 출력하거나 대기한다(스택에 넣는다) 
//연산자의 대기(스택에 push)여부는 연산자간의 우선순위에 따른다.

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		char[] arr = br.readLine().toCharArray();

		for (int i = 0; i < arr.length; i++) {
			int p = priority(arr[i]);
			switch (arr[i]) {
			case '+':
			case '-':
			case '*':
			case '/':
				while (!stack.isEmpty() && priority(stack.peek()) >= p) {
					System.out.print(stack.pop());
				}
				stack.push(arr[i]);
				break;
			case '(':
				stack.push(arr[i]);
				break;
			case ')':
				while (!stack.isEmpty() && stack.peek() != '(') {
					System.out.print(stack.pop());
				}
				stack.pop();
				break;
			default:
				System.out.print(arr[i]);
			}
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
	// 스택의 top보다 다음 연산자의 우선순위가 클 경우 push 하고, 그렇지 않을 경우, pop한다.
	// (우선순위가 같다면, 먼저 스택에 들어온 연산자를 먼저 내보내야하기 때문에 클 경우만 push를 한다.)
	// 그리고, 알다시피 괄호는 우선적으로 처리해줘야하기 때문에, 괄호가 닫히면 이전 괄호까지 pop을 해준다.

	public static int priority(char c) {
		switch (c) {
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		case '(':
		case ')':
			return 0;
		}
		return -1;
	}
}