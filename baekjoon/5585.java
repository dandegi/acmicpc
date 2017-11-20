package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 1000 - Integer.parseInt(br.readLine());
        int[] a = {500, 100, 50, 10, 5, 1};
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            cnt += n / a[i];
            n -= a[i] * (n/a[i]);
            if(n == 0)
                break;
        }
        System.out.println(cnt);
    }
}
