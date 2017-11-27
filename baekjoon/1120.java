package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 99999999;

        String[] s = br.readLine().split(" ");
        String a = s[0];
        String b = s[1];
        int cnt;
        for(int i=0; i<=b.length()-a.length(); i++) {
            cnt = 0;
            for(int j=0; j<a.length(); j++) {
                if(a.charAt(j) != b.charAt(j+i))
                    cnt++;
            }
            if(min>cnt) {
                min = cnt;
            }
        }
        System.out.println(min);
    }
}
