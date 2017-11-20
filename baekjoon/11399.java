package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int sum = a[0];
        for(int i=1; i<n; i++) {
            a[i] = a[i-1] + a[i];
            sum += a[i];
        }
        System.out.println(sum);
    }
}
