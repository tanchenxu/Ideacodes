package com.akuya.RealProblem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @description 问题描述
 *
 * 给定正整数 a, b, c，请问有多少个正整数，是其中至少两个数的约数。
 *
 * 输入格式
 *
 * 输入一行包含三个正整数 a, b, c。
 *
 * 输出格式
 *
 * 输出一行包含一个整数，表示答案。
 *
 * 样例输入
 *
 * 30 70 35
 *
 * 样例输出
 *
 * 6
 *
 * 样例说明
 *
 * 1、2、5、7、10、35满足条件。
 *
 * 评测用例规模与约定
 *
 * 对于 50% 的评测用例，1 <= a, b, c <= 1000000。
 * 对于所有评测用例，a, b, c 不超过 10**12（10的12次方）。
 * @author akuya
 * @create 2022-03-29-20:20
 */
public class CommonDivisor {
    static Long a,b,c;
    static Set<Long> set1=new HashSet<Long>();
    static Set<Long> set2=new HashSet<Long>();
    static Set<Long> result=new HashSet<Long>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextLong();
        b=scanner.nextLong();
        c=scanner.nextLong();

        put(a);
        put2(b);
        put3(c);

        for(Long l:result){
            System.out.println(l);
        }
        System.out.println(result.size());

    }

    public static void put(Long a){
        for(Long i=1L;i<a/i;i++){
            if((a%i)==0){
                set1.add(i);
                set1.add(a/i);
            }
        }
    }

    public static void put2(Long b){
        for(Long i=1L;i<b/i;i++){
            if(b%i==0){
                set2.add(i);
                set2.add(b/i);
                if(set1.contains(i)){
                    result.add(i);
                }
                if(set1.contains(b/i))
                result.add(b/i);
            }
        }
    }

    public static void put3(Long c){
        for(Long i=1L;i<c/i;i++){
            if(c%i==0&&(set1.contains(i)||set2.contains(i))){
                result.add(i);
            }else if(c%i==0&&(set1.contains(c/i)||set2.contains(c/i))){
                result.add(c/i);
            }
        }
    }



}
