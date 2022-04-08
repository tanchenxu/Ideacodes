package com.akuya.test;

/**
 * @author akuya
 * @create 2022-04-08-19:55
 */
import java.util.*;
public class zhixian {
    static int gcd(int a,int b){
        return b == 0 ? a : gcd(b, a%b);
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<String> ans = new HashSet<>();
        int x = 19,y = 20;
        for (int i = 0; i <= x; i++) {         //将坐标以一个四位数的方式存入集合，x是百位千位，y是十位和个位。
            for (int j = 0; j <= y; j++) {
                set.add(i*100 +j);
            }
        }
        List<Integer> arr = new ArrayList<>(set);
        int len = arr.size();                //坐标个数
        for (int i = 0; i < len; i++) {
            int a = arr.get(i);              //取出一个坐标
            for (int j = i+1; j < len; j++) {
                int b = arr.get(j);          //取出其他坐标
                int x1 = a/100, x2 = b/100, y1 = a%100, y2 = b%100;
                int up = y1-y2, down = x1-x2;
                int c1 = gcd(up,down);       //求最大公约数
                String k = (up/c1)+" "+(down/c1);//斜率
                if(down == 0){
                    ans.add("x = " + x1); //如果直线垂直与x轴则直接抛入ans集合，该情况共有19种。
                    continue;
                }
                int kb = y1*down - up*x1;
                int c2 = gcd(kb,down);
                String B = (kb / c2)+" "+(down/c2);//截距
                ans.add(k+" "+B);
            }
        }
        System.out.println(ans.size());
    }
}

