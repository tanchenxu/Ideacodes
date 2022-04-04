package com.akuya.RealProblem;

/**
 * @author akuya
 * @create 2022-04-03-19:31
 */
import java.util.Scanner;

public class TwoNQueen {
    static int result=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[][]=new int [n][n];
        dfs(arr, n ,1);
        System.out.println(result);
    }
    public static void dfs(int arr[][],int n,int level) {
        if(level==5){
            result++;
            return;
        }

        for(int i=0;i<n;i++){
            if(check(arr,level-1,i)){
                arr[level-1][i]=1;
                dfs(arr, n,level+1);
                arr[level-1][i]=0;
            }
        }

    }
    public static boolean check (int arr[][],int wide,int length) {
        //判断列
        for(int j=0;j<wide;j++){
            if(arr[j][length]==1){
                return false;
            }
        }
        //判断斜
        for(int i=wide-1,j=length-1;i>=0&&j>=0;i--,j--){
            if(arr[i][j]==1){
                return false;
            }
        }

        for(int i=wide -1,j=length+1;i>=0&&j>=0&&j<arr.length;i--,j++){
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;
    }
}

