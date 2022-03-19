package com.akuya.DP;

import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-03-14-19:51
 */
public class ZeroOneBag {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int capacity=scanner.nextInt();
        int p[]=new int[number+1];
        int w[]=new int[number+1];


        for(int i=1;i<number+1;i++){
            p[i]=scanner.nextInt();
            w[i]=scanner.nextInt();
        }

        int profit=choose(capacity,number,p,w);

        System.out.println(profit);



    }

   public static int choose(int capacity,int number,int p[],int w[]) {
        int bag[][]=new int [number+1][capacity+1];
        if(1>=w[1]){
            bag[1][1]=p[1];
        }else{
            bag[1][1]=0;
        }

        for(int j=2;j<=capacity;j++){
            if(j>=w[1]){
                bag[1][j]=p[1];
            }else{
                bag[1][j]=0;
            }
        }

        for(int i=2;i<=number;i++){
            for(int j=2;j<=i;j++){
                if(w[j]==1&&p[j]>bag[i][j]){
                    bag[i][j]=p[j];
                }
            }
        }

        for(int i=2;i<=number;i++){
            for(int j=2;j<=capacity;j++){
                if(w[i]>j){
                    bag[i][j]=bag[i-1][j];
                }else if(w[i]==j){
                    bag[i][j]=Math.max(bag[i-1][j],p[i]);
                }else{
                    bag[i][j]=Math.max(bag[i-1][j],p[i]+bag[i-1][j-w[i]]);
                }
            }
        }
//查询选取的货物
        int temp=bag[number][capacity];
        for(int i=1,j=capacity;i<=number;i++){
            if(bag[i][j]==temp){
                System.out.print(i+" ");
                temp=temp-p[i];
                j=j-w[i];
                i=0;
            }
            if(temp==0){
                break;
            }
        }

        System.out.println();

        return bag[number][capacity];

    }


}
