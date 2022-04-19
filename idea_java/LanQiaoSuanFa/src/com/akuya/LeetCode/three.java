package com.akuya.LeetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @description
 * @author akuya
 * @create 2022-04-17-14:04
 */
public class three {
    /*static int arr[]=new int[128];
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Set set = new HashSet();
        int length = 0;
        int temp = set.size();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            if (set.size() > temp) {
                temp = set.size();
                int index=s.charAt(i);
                arr[index]=i;
                if (i == s.length() - 1) {
                    length = Math.max(temp, length);
                }
            } else if (temp <= set.size()) {

                length = Math.max(temp, length);
                temp = 0;
                set.clear();
                int as=i;
                i=arr[s.charAt(i)];
                arr[s.charAt(i)]=as;
            }

        }
        System.out.println(length);
    }*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        System.out.println(ans);
    }
}

