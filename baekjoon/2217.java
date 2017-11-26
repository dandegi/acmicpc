package com.company;

import java.io.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        for(int i=n-1; i>=0; i--) {
            if(ans < a[i]*(n-i))
                ans = a[i]*(n-i);
        }
        System.out.println(ans);
    }
}
