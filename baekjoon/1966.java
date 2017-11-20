package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Queue<Integer> q = new LinkedList<>();
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[] a = new int[n];

            s = br.readLine().split(" ");
            for(int i=0; i<n; i++) {
                a[i] = Integer.parseInt(s[i]);
                q.offer(a[i]);
            }
            Arrays.sort(a);
            reverse(a);
            int cnt = 0;
            while(true) {
                if(q.peek() != a[cnt]) {
                    q.offer(q.poll());
                } else {
                    if(m==0)
                        break;
                    n--;
                    cnt++;
                    q.poll();
                }
                m=(m-1+n) %n;
            }
            sb.append(cnt+1).append("\n");
        }
        System.out.print(sb);
    }
    public static void reverse(int[] array) {
        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
    }
}
