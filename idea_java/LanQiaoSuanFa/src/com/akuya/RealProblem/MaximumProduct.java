package com.akuya.RealProblem;

import java.util.HashSet;
import java.util.Set;

/**
 * @description 本题为填空题，只需要算出结果后，在代码中使用输出语句将所填结果输出即可。
 *
 * 把 1 ~ 9 这 9 个数字分成两组，中间插入乘号， 有的时候，它们的乘积也只包含 1 ~ 99 这 9 个数字，而且每个数字只出现 1 次。
 * 符合这种规律的算式还有很多，请你计算在所有这些算式中，乘积最大是多少？
 *
 * 注意，需要输出的是一个整数，表示那个最大的积，只输出乘积，不要输出整个算式。
 * @author akuya 本体非本人敲写，复制标码学习借鉴。
 * @create 2022-04-01-17:14
 */
public class MaximumProduct {
    static int max=0;
    static int[] arr= {1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        dfs(0);
        System.out.println(max);
    }
    //全排列 整个代码最精华的部分 dfs的全排列
    static void dfs(int k) {
        if(k==9) {
            check();
            return;
        }
        for(int i=k;i<arr.length;++i) {
            exch(i,k);
            dfs(k+1);
            exch(i,k);
        }
    }
    //插入乘号位置
    static void check() {
        for(int i=1;i<=8;++i) {
            int a=test(arr,i);
            if(isOk(a)) {
                max=Math.max(a,max);
            }
        }
    }
    //获取乘积
    static int test(int[] arr,int k) {
        int pre=0;
        int count1=0;
        while(k-->0) {
            count1=count1*10+arr[pre];
            pre++;
        }
        int count2=0;
        for(int i=pre;i<arr.length;++i) {
            count2=count2*10+arr[i];
        }
        return count1*count2;
    }
    //判断答案是否有且仅包含1~9
    static boolean isOk(int n){
        Set<Integer> set=new HashSet<>();
        for(int i=1;i<=9;++i) set.add(i);
        while(n!=0) {
            int a=n%10;
            if(!set.contains(a)) return false;
            else set.remove(a);
            n/=10;
        }
        return set.size()==0;
    }
    //交换函数
    static void exch(int a,int b) {
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
}
