import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Double> stack = new Stack<>();
		int num = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		double[] v = new double[26];
		for(int i=0; i<num; i++) {
			v[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				stack.push(v[arr[i]-65]);
			} else {
				Double op1, op2;
				switch(arr[i]) {
				case '+':
					op1 = stack.pop();
					op2 = stack.pop();
					stack.push(op1+op2);
					break;
				case '-':
					op1 = stack.pop();
					op2 = stack.pop();
					stack.push(op2-op1);
					break;
				case '*':
					op1 = stack.pop();
					op2 = stack.pop();
					stack.push(op1*op2);
					break;
				case '/':
					op1 = stack.pop();
					op2 = stack.pop();
					stack.push(op2/op1);
					break;
				}
			}
		}
		
		System.out.format("%.2f", stack.pop());
	}
}