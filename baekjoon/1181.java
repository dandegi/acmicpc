import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		ArrayList<Word> list = new ArrayList<Word>();
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			list.add(new Word(s));
		}
		for(int i=0; i<list.size(); i++) {
			String temp = list.get(i).s;
			for(int j=i+1; j<list.size(); j++) {
				if(temp.equals(list.get(j).s)) {
					list.remove(j);
					j--;
				}
			}
		}
		Collections.sort(list, new WordSort());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i).s+"\n");
		}
		System.out.println(sb);
	}
}

class Word {
	String s;
	public Word(String s) {
		this.s = s;
	}
	public String toString() {
		return s;
	}
}
class WordSort implements Comparator<Word> {

	@Override
	public int compare(Word o1, Word o2) {
		// TODO Auto-generated method stub
		if(o1.s.length() < o2.s.length()) {
			return -1;
		} else if(o1.s.length() > o2.s.length()) {
			return 1;
		} else if(o1.s.length() == o2.s.length()){
			return o1.s.compareTo(o2.s);
		} else {
			return 0;
		}
	}
}
