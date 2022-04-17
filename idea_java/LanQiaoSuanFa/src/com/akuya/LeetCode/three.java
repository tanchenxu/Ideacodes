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
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String s=scanner.nextLine();
        Set set=new HashSet();
        int length=0;
        int temp =set.size();
        for(int j=0;j<s.length();j++) {
            for (int i = j; i < s.length(); i++) {
                set.add(s.charAt(i));
                if (set.size() > temp) {
                    temp = set.size();
                    if (i == s.length() - 1) {
                        length = Math.max(temp, length);
                    }
                } else if (temp <= set.size()) {

                    length = Math.max(temp, length);
                    temp = 0;
                    set.clear();
                    i=s.indexOf(s.charAt(i),);
                }

            }
        }
        System.out.println(length);
    }


}
