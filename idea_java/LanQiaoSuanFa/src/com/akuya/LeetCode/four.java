package com.akuya.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-04-19-15:52
 */
public class four {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num1[]=new int [3];
        int num2[]=new int [3];
        for( int i=0;i<3;i++){
            num1[i]=scanner.nextInt();
            num2[i]=scanner.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<num1.length;i++){
            list.add(num1[i]);
            list.add(num2[i]);
        }

        int result[]=new int[list.size()];
        int i=0;
        for(int a:list){
            result[i]=a;
            i++;
        }

        Arrays.sort(result);
        if(result.length%2==0){
            double ans=(double) (result[result.length/2]+result[result.length/2-1])/2;
            System.out.println("%.5lf\n",ans);
        }else{
            double ans=(double)result[result.length/2];
            System.out.println(ans);
        }
    }
}
