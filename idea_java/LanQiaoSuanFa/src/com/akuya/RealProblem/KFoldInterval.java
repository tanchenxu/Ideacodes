package com.akuya.RealProblem;

/**
 * 给定一个长度为 NN 的数列，A_1, A_2, \cdots A_NA
 * 1
 *  ,A
 * 2
 *  ,⋯A
 * N
 * ​
 *  ，如果其中一段连续的子序列 A_i,A_i+1, \cdots A_jA
 * i
 * ​
 *  ,A
 * i
 * ​
 *  +1,⋯A
 * j
 * ​
 *   ( i \leq ji≤j ) 之和是 KK 的倍数，我们就称这个区间 [i, j][i,j] 是 K 倍区间。
 *
 * 你能求出数列中总共有多少个 KK 倍区间吗？
 * @author akuya
 * @create 2022-04-05-15:13
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KFoldInterval {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        long arr[]=new long[n+1];
        for(int i=0;i<n;i++){
            arr[i+1]=arr[i]+scanner.nextLong();
        }

        Map<Long, Integer> map =new HashMap<>();
        map.put(0L, 1);
        int result =0;
        for(int i=1;i<arr.length;i++){
            result+=map.getOrDefault(arr[i]%k,0);
            map.put(arr[i]%k, map.getOrDefault(arr[i]%k, 0)+1);
        }

        System.out.println(result);
    }
}
