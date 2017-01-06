import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int c = Integer.parseInt(s);
		
		for (int i=1; i<c; i++) {
			double p = 0;
			Double ave = 0.0;
			Double sum = 0.0;
			String[] ss = br.readLine().split(" ");
			double n = Double.parseDouble(ss[0]);
			ArrayList<Double> list = new ArrayList<Double>();
			for(int j=1; j<=n; j++) {
				list.add(Double.parseDouble(ss[j]));
				sum += Double.parseDouble(ss[j]);
			}
			ave = (sum/n);
			for(int j=0; j<list.size(); j++) {
				if(list.get(j)>ave) {
					p++;
				}
			}
			System.out.format("%.3f%"+"%"+"\n", p/n*100);
		}
	}
}