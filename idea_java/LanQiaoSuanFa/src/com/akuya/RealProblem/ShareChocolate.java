package com.akuya.RealProblem;

/**
 * @description 儿童节那天有 K 位小朋友到小明家做客。小明拿出了珍藏的巧克力招待小朋友们。
 *
 * 小明一共有 N 块巧克力，其中第 i 块是 Hi×Wi 的方格组成的长方形。为了公平起见，
 *
 * 小明需要从这 N 块巧克力中切出 K 块巧克力分给小朋友们。切出的巧克力需要满足：
 *
 * 形状是正方形，边长是整数;
 *
 * 大小相同;
 *
 * 例如一块 6x5 的巧克力可以切出 6 块 2x2 的巧克力或者 2 块 3x3 的巧克力。
 *
 * 当然小朋友们都希望得到的巧克力尽可能大，你能帮小明计算出最大的边长是多少么？
 * @author akuya 本题考察的是二分查找的方法
 * @create 2022-04-03-16:41
 */
import java.util.Scanner;

public class ShareChocolate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int K=scanner.nextInt();
        int N=scanner.nextInt();
        int arr[][]=new int[N][2];
        for(int i=0;i<N;i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
        }

        int l=1;
        int r=10000;
        while(l<r){
            int mid=(1+l+r)/2;
            if(check(arr,mid,K)){
                l=mid;
            }
            else{
                r=mid-1;
            }

        }
        System.out.println(l);
    }
    public static boolean check(int arr[][],int mid,int k) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=((arr[i][0]/mid)*(arr[i][1]/mid));
        }
        if(count>=k){
            return true;
        }else{
            return false;
        }

    }
}
