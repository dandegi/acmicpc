import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> list = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);

		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		int count = 1;
		while (list.isEmpty() == false) {
			if (count % m != 0) {
				int f = list.getFirst();
				list.removeFirst();
				list.addLast(f);
			}
			if (count % m == 0) {
				if (list.size() == 1) {
					sb.append(list.getFirst());
				} else {
					sb.append(list.getFirst()+", ");
				}
				list.removeFirst();
			}
			count++;
		}
		System.out.println("<" + sb + ">");
	}
}