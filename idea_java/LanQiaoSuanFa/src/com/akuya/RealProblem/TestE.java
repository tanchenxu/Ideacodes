package com.akuya.RealProblem;

import java.util.Arrays;

/**
 * @author akuya
 * @create 2022-04-08-21:29
 */
public class TestE {
    static int mery[][]=new int[2022][2022];
    public static void main(String[] args) {
        for(int i=0;i<2022;i++){
            Arrays.fill(mery[i],Integer.MAX_VALUE);
        }

    int result =Dp();
        System.out.println(result);
    }

    public static int  Dp(){
        for(int i=2;i<=22;i++){
            mery[1][i]=(1*i)/gcd(1,i);
        }

        for(int i=2;i<=2020;i++){
            for(int j=i+1;j<=2021&&j<=i+21;j++){
                for(int k=1;k<=21&&i-k>=1;k++){
                    mery[i][j]=Math.min(mery[i-k][i]+(i*j)/gcd(i,j),mery[i][j]);
                }

            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=2000;i<=2020;i++){

            min=Math.min(mery[i][2021],min);
        }
        return min;
    }


    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

}
/*
public class TestE {

    public static void main(String[] args) {
        int[] f = new int[2050];
        for (int i = 1; i <= 2021; i++) {
            for (int j = i + 1; j <= i + 21; j++) {
                if (f[j] == 0) {
                    f[j] = f[i] + lcm(i, j);
                } else {
                    f[j] = Math.min(f[j], f[i] + lcm(i, j));
                }
            }
        }
        System.out.println(f[2021]);
    }

    private static int lcm(int a, int b) {
        int t = 1;
        while (b * t % a != 0) {
            t++;
        }
        return t * b;
    }

}
*/