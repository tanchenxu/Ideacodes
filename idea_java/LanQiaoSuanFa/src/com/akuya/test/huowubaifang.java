package com.akuya.test;

/**
 * @author akuya
 * @create 2022-04-08-20:28
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class huowubaifang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...

        List<Long> yz = new ArrayList<>();

        long n = 2021041820210418L;
        for (long i=1; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                yz.add(i);
                yz.add(n/i);
            }
        }

        int cnt = 0;
        for (int i=0; i<yz.size(); i++) {
            for (int j=0; j<yz.size(); j++) {
                for (int k=0; k<yz.size(); k++) {
                    if (yz.get(i) * yz.get(j) * yz.get(k) == n) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

        scan.close();
    }
}
