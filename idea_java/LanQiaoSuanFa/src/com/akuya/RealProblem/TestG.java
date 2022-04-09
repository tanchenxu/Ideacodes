package com.akuya.RealProblem;

/**
 * @author akuya
 * @create 2022-04-09-23:14
 */
import java.util.Scanner;

public class TestG {
    static int N;
    static int result;
    static int arr[];
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        N=scanner.nextInt();
        arr=new int [N];
        for(int i=0;i<N;i++) {
            arr[i]=scanner.nextInt();
        }
        dfs(0);
        System.out.println(result);
        scanner.close();
    }

    public static void dfs(int pos) {
        if(pos==arr.length||pos==arr.length-1) {
            result++;
            return;
        }


        for(int i=pos;i<arr.length;i++) {
            int max=arr[pos];
            int min=arr[pos];
            for(int j=pos;j<=i;j++) {
                if(max<arr[j]) {
                    max=arr[j];
                }
                if(min>arr[j]) {
                    min=arr[j];
                }
            }
            if((Math.abs(max-min))==(Math.abs(i-pos))) {
                dfs(i+1);
            }
        }
    }
}
