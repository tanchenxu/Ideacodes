package com.akuya.DP;

import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-03-17-21:58
 */
public class FrogJumpingStone {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int NumStone =scanner.nextInt();
        int stone []=new int [NumStone+1];
        for(int i=1;i<=NumStone;i++){
            stone[i]=scanner.nextInt();
        }
        boolean result=isOK(NumStone,stone);
        System.out.println(result);
    }
    public static boolean isOK(int number,int [] stone){

       boolean mery[]=new boolean[number+1];
       mery[1]=true;
        for(int i=2;i<=number;i++){
            mery[i]=false;
            for(int j=1;j<i;j++){
                if(mery[j]&&(j+stone[j])>=i){
                    mery[i]=true;
                    break;
                }
            }
        }

        return mery[number];
    }

}
