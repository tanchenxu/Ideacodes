package com.akuya.RealProblem;

/**
 * @description 某财务部门结账时发现总金额不对头。很可能是从明细上漏掉了某 1 笔或几笔。如果已知明细账目清单，能通过编程找到漏掉的是哪 1 笔或几笔吗？
 *
 * 如果有多种可能，则输出所有可能的情况。
 * @author akuya
 * @create 2022-04-04-15:34
 */
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AmountError {
    static List<Integer> path=new ArrayList();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //错误的金额
        int count=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        //计算正确的金额
        int ans=0;
        for(int i=0;i<n;++i) {
            arr[i]=sc.nextInt();
            ans+=arr[i];
        }
        int target=ans-count;
        Arrays.sort(arr);
        dfs(arr,target,0);
    }

    static void dfs(int[] arr,int target,int start) {
        //剪枝
        if(target<0) return;
        if(target==0) {
            for(int a:path) {
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<arr.length;i++) {
            //去重核心代码

            path.add(arr[i]);
            dfs(arr,target-arr[i],i+1);
            path.remove(path.size()-1);
        }
    }
}*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AmountError {
    static List<List<Integer>> list2=new ArrayList<>();
    static List<Integer> list=new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count =scanner.nextInt();
        int number=scanner.nextInt();
        int arr[]=new int [number];
        int temp=0;
        int target=0;
        for(int i=0;i<number;i++){
            arr[i]=scanner.nextInt();
            temp+=arr[i];
        }
        target=temp-count;
        Arrays.sort(arr);
        dfs(arr,0,target);
        for(List<Integer> l:list2){
            for(int i:l){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void dfs(int arr[],int start,int target) {
        if(target<0){
            return;
        }
        if(target==0){
            List<Integer> temp=new ArrayList<>(list);
            list2.add(temp);
            return;
        }

        for(int i=start;i<arr.length;i++){
            if(i>start&&arr[i]==arr[i-1])
                continue;
            list.add(arr[i]);
            dfs(arr, i+1, target-arr[i]);
            list.remove(list.size()-1);
        }
    }
}