package com.akuya.RealProblem;

/**
 * @author akuya
 * @create 2022-04-11-21:02
 */
import java.util.Arrays;
import java.util.Scanner;

public class CompetitionE {
    static int result;
    static int N,M;
    static int com;
    static int meryw[];
    static int meryl[];
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        N=scanner.nextInt();
        M=scanner.nextInt();
        meryw=new int[10000000];
        meryl=new int[10000000];
        int arr[][]=new int [N][M];
        Arrays.fill(meryl, Integer.MAX_VALUE);
        Arrays.fill(meryw, Integer.MAX_VALUE);
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        com= scanner.nextInt();

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                for(int k=1;k+i<N;k++) {
                    if(k>=meryw[i*100+j]) {
                        break;
                    }
                    for(int l=1;l+j<M;l++) {
                        if(l>=meryl[i*100+j]) {
                            break;
                        }else {
                            check(i,j,k,l,arr);
                        }
                    }
                }
            }
        }

        System.out.println(result);
        scanner.close();
    }
    public static void check(int i,int j,int k,int l,int arr[][]){
        int max,min;
        max=arr[i][j];
        min=arr[i][j];
        for(int s=i;s<k;s++) {
            for(int b=j;b<l;b++) {
                if(max<arr[s][b]) {
                    max=arr[s][b];
                }
                if(min>arr[s][b]) {
                    min=arr[s][b];
                }
            }
        }
        int isok=max-min;
        if(isok<=com) {
            if((i+k)*(j+l)>result) {
                result=(i+k)*(j+l);
            }
        }else {
            meryw[(i)*100+(j)]=k;
            meryl[(i)*100+(j)]=l;
        }
    }
}
