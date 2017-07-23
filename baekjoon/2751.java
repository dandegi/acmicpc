import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sort {
	int i=0;
	public int partition(int a[], int begin, int end) {
		int pivot, temp, l, r;
		
		l = begin;
		r = end;
		pivot = (begin+end)/2;
		
		while(l<r) {
			while( (a[l] < a[pivot]) && (l<r)) {
				l++;
			}
			while( (a[r] >= a[pivot]) && (l<r)) {
				r--;
			}
			
			if(l<r) {
				temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				
				if(l == pivot) {
					pivot = r;
				}
			}
		}
		
		temp = a[pivot];
		a[pivot] = a[r];
		a[r] = temp;
		return r;
	}
	
	public void quickSort(int a[], int begin, int end) {
		if(begin<end) {
			int p;
			p = partition(a, begin, end);
			quickSort(a, begin, p-1);
			quickSort(a, p+1, end);
		}
	}
}

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Sort s = new Sort();
		s.quickSort(a, 0, n-1);
		for(int i=0; i<n; i++) {
			sb.append(a[i]).append("\n");
		}
		System.out.print(sb);
	}
}