import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> list = new ArrayList<Double>();
		ArrayList<Double> ave = new ArrayList<Double>();
		String s = br.readLine();
		int n = Integer.parseInt(s);
		Double sum = 0.0;
		String [] ss = br.readLine().split(" ");
		for (int i=0; i<n; i++) {
			list.add(Double.parseDouble(ss[i]));
		}
		Collections.sort(list);
		Double m = list.get(list.size()-1);
		for (int i=0; i<list.size(); i++) {
			ave.add(list.get(i)/m*100);
			sum += ave.get(i);
		}
		System.out.format("%.2f%n", sum/n);
	}
}