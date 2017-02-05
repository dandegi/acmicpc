import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=t; i++) {
			String[] s = br.readLine().split("");
			sb.append("Case #" + i + ": ");
			for(int j=0; j<s.length; j++) {
				
				switch(s[j]) {
				
				case "a" : {
					sb.append("y");
					break;
				}
				case "b" : {
					sb.append("h");
					break;
				}
				case "c" : {
					sb.append("e");
					break;
				}
				case "d" : {
					sb.append("s");
					break;
				}
				case "e" : {
					sb.append("o");
					break;
				}
				case "f" : {
					sb.append("c");
					break;
				}
				case "g" : {
					sb.append("v");
					break;
				}
				case "h" : {
					sb.append("x");
					break;
				}
				case "i" : {
					sb.append("d");
					break;
				}
				case "j" : {
					sb.append("u");
					break;
				}
				case "k" : {
					sb.append("i");
					break;
				}
				case "l" : {
					sb.append("g");
					break;
				}
				case "m" : {
					sb.append("l");
					break;
				}
				case "n" : {
					sb.append("b");
					break;
				}
				case "o" : {
					sb.append("k");
					break;
				}
				case "p" : {
					sb.append("r");
					break;
				}
				case "q" : {
					sb.append("z");
					break;
				}
				case "r" : {
					sb.append("t");
					break;
				}
				case "s" : {
					sb.append("n");
					break;
				}
				case "t" : {
					sb.append("w");
					break;
				}
				case "u" : {
					sb.append("j");
					break;
				}
				case "v" : {
					sb.append("p");
					break;
				}
				case "w" : {
					sb.append("f");
					break;
				}
				case "x" : {
					sb.append("m");
					break;
				}
				case "y" : {
					sb.append("a");
					break;
				}
				case "z" : {
					sb.append("q");
					break;
				}
				default : {
					sb.append(" ");
					break;
				}
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}