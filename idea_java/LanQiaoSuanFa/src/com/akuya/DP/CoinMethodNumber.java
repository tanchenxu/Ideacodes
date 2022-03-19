package com.akuya.DP;

import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-03-16-22:00
 */
public class CoinMethodNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int amount =scanner.nextInt();
        int numberofcoin=scanner.nextInt();
        int coins[]=new int[numberofcoin+1];
        for(int i=1;i<=numberofcoin;i++){
            coins[i]= scanner.nextInt();
        }
        int result=NumOfMeth(coins,amount,numberofcoin);
        System.out.println(result);
    }



    public static int NumOfMeth(int coins[],int amount,int number){
        int mery[][]=new int[number+1][amount+1];
        if(coins[1]==1){
            mery[1][1]=1;
        }
        for(int j=2;j<=amount;j++){
            if(j%coins[1]==0){
                mery[1][j]=1;
            }else{
                mery[1][j]=0;
            }
        }
        int pos=-1;
        for(int i=1;i<=number;i++){
            if(coins[i]==1||i-1==pos){
                mery[i][1]=1;
                pos=i;
            }else {
                mery[i][1]=0;
            }
        }

        for(int i=2;i<=number;i++){
            for(int j=2;j<=amount;j++){
                if(coins[i]>j){
                    mery[i][j]=mery[i-1][j];
                }else if(coins[i]==j){
                    mery[i][j]=mery[i-1][j]+1;
                }else{
                    mery[i][j]=mery[i-1][j]+mery[i][j-coins[i]];
                }

            }
        }

return mery[number][amount];


    }

}
