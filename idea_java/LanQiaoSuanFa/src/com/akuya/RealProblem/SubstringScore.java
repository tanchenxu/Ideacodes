package com.akuya.RealProblem;

/**
 * @description 对于一个字符串 SS，我们定义 SS 的分值 f(S)f(S) 为 SS 中恰好出现一次的字符个数。例如 f(aba) = 1，f(abc) = 3, f(aaa) = 0f(aba)=1，f(abc)=3,f(aaa)=0。
 *
 * 现在给定一个字符串 S_{0 \cdots n − 1}S
 * 0⋯n−1
 * ​
 *  （长度为 nn，1 \leq n \leq 10^51≤n≤10
 * 5
 *  ），请你计算对于所有 SS 的非空子串 S_{i \cdots j}(0 ≤ i ≤ j < n)S
 * i⋯j
 * ​
 *  (0≤i≤j<n)，f(S_{i \cdots j})f(S
 * i⋯j
 * ​
 *  ) 的和是多少。
 * @author akuya 非本人所写，调试理解，实在太牛啦
 *
 * @create 2022-04-05-19:12
 */

import java.util.Arrays;
import java.util.Scanner;

public class SubstringScore {
    //满分答案
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        //记录每个字符a在前一次出现的位置，如果没有则为-1
        int[] pre=new int[n];
        //记录每个字符a在后一次出现的位置，如果没有则为n
        int[] next=new int[n];
        int[] where=new int[26];//统计每个字符最后一次出现的下标
        Arrays.fill(where, -1);
        //这样能得到i处字符前一次出现的位置
        for(int i=0;i<n;++i) {
            pre[i]=where[s.charAt(i)-'a'];
            where[s.charAt(i)-'a']=i;
        }
        Arrays.fill(where, n);
        for(int i=n-1;i>=0;i--) {
            next[i]=where[s.charAt(i)-'a'];
            where[s.charAt(i)-'a']=i;
        }
        //统计答案
        int ans=0;
        for(int j=0;j<n;++j) {
            ans+=(j-pre[j])*(next[j]-j);
        }
        System.out.println(ans);
    }
}

