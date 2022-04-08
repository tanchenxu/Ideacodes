package com.akuya.RealProblem;

/**
 * @description Lazy有N个礼物需要打成M个包裹，邮寄给M个人，这些礼物虽然很便宜，但是很重。Lazy希望每个人得到的礼物的编号都是连续的。
 * 为了避免支付高昂的超重费，他还希望让包裹的最大重量最小。
 * @author akuya
 * @create 2022-04-07-9:22
 */
import java.util.Scanner;

public class Pack {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        int max=0;
        int sum=0;
        int wight[]=new int [N+1];
        for(int i=1;i<=N;i++){
            wight[i]=scanner.nextInt();
            max=Math.max(wight[i], max);
            sum+=wight[i];
        }


        int l=max;
        int r=sum;
        while(l<r){
            int mid=(l+r)>>1;
            if(check(mid,wight,N,K)){
                r=mid;
            }else {
                l=mid+1;
            }
        }
        System.out.println(l);
    }

    public static boolean check(int mid,int []wigth,int N,int K) {
        int count=0;
        int temp=0;
        for(int i=1;i<=N;i++){
            count+=wigth[i];
            if(count>mid){
                count=0;
                temp++;
                i--;
            }else if(i==N){
                temp++;
            }
        }

        return temp<=K;
    }
}