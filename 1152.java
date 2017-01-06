import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		ST st = new ST();
//		String s = br.readLine();
//		int n = Integer.parseInt(s);
//		int count = 0;
//		for (int i=0; i<n; i++) {
//			st.push();
//			if(st.vs()) {
//				count++;
//			}
//		}
//		System.out.println(count);	
//		}
//	}
//
//class ST {
//	Stack<Character> stack;
//	BufferedReader br;
//	
//	public ST() {
//		stack = new Stack<Character>();
//		br = new BufferedReader(new InputStreamReader(System.in));
//	}
//	
//	public void push() throws IOException {
//		String ss = br.readLine();
//		for(int i=0; i<ss.length(); i++) {
//			stack.push(ss.charAt(i));
//		}
//	}
//	public boolean vs() {
//		boolean boo = true;
//		while(stack.isEmpty()!=true) {
//		char a = stack.pop();
//		if(stack.isEmpty()) {
//			boo = false;
//			break;
//		}
//		char b = stack.pop();
//		if(a == b) {
//			continue;
//		} else if(a != b) {
//			if(stack.isEmpty()) {
//				boo = false;
//				break;
//			}
//			a = stack.pop();
//			if(a!=b) {
//				boo = false;
//			} else if(a==b) {
//				continue;
//			}
//		}
//		}
//		return boo;
//	}
//}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<String> list = new LinkedList<String>();
		while(st.hasMoreTokens()!=false) {
			list.add(st.nextToken());
		}
		System.out.println(list.size());
	}
}