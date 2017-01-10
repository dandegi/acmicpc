
public class Main {
	public static void main(String[] args) {
		int[] arr = new int[10001];
		int x = 0;
		for (int i = 1; i < 10000; i++) {
			if (i < 10) {
				x = i + i;
				arr[x]++;
			} else if (i >= 10 && i < 100) {
				String s = "";
				s += i;
				x = i + ((int) s.charAt(0) - 48) + ((int) s.charAt(1) - 48);
				arr[x]++;
			} else if (i >= 100 && i < 1000) {
				String s = "";
				s += i;
				x = i + ((int) s.charAt(0) - 48) + ((int) s.charAt(1) - 48) + ((int) s.charAt(2) - 48);
				if (x > 10000) {
					continue;
				} else {
					arr[x]++;
				}
			} else if (i >= 1000 && i < 10000) {
				String s = "";
				s += i;
				x = i + ((int) s.charAt(0) - 48) + ((int) s.charAt(1) - 48) + ((int) s.charAt(2) - 48)
						+ ((int) s.charAt(3) - 48);
				if (x > 10000) {
					continue;
				} else {
					arr[x]++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<10000; i++) {
			if(arr[i] == 0) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

}