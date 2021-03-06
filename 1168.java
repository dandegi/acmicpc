import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		int mm = m - 1;
		for (int i = 0; i < n; i++) {
				sb.append(list.get(mm));
			list.remove(mm);
			if (list.size() == 0) {
				break;
			}
			sb.append(", ");
			mm += m - 1;
			mm = mm % list.size();
		}
		System.out.println("<" + sb + ">");
	}
}