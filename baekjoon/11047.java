package com.company;

import java.io.*;
import java.util.*;

//        Integer[] arr = new Integer[n]; 배열 내림차순 정렬하기
//        for (int i = 0; i < n; i++) {
//        arr[i] = scanner.nextInt();
//        }
//        Arrays.sort(arr, Collections.reverseOrder());

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int[] a = new int[n];
        int tmp = n-1;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
            if (a[i] > k && flag == false) {
                tmp = i-1;
                flag = true;
            }
        }
        int cnt = 0;
        for (int i = tmp; i >= 0; i--) {
            cnt += k / a[i];
            k -= a[i] * (k/a[i]);
            if(k == 0)
                break;
        }
        System.out.println(cnt);
    }
}
