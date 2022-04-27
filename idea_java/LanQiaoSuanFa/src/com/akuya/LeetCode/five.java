package com.akuya.LeetCode;

import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-04-27-20:30
 */
public class five {
    static boolean[][] mery;
    static int maxlen=1;
    static int begin=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if(s.length()<2){
            System.out.println(s);
            return ;
        }
        char[] schar=s.toCharArray();
        mery=new boolean[s.length()][s.length()];

        for(int i=0;i<s.length();i++){
            mery[i][i]=true;
        }
        DP(s,schar);
        System.out.println(s.substring(begin,begin+maxlen));
        scanner.close();

    }

    public static void DP(String s,char[] schar){
        for(int L=2;L<=s.length();L++){
            for(int i=0;i<s.length();i++){
                int j=L+i-1;
                if(j>=s.length()){
                    break;
                }
                if(j-i<3&&schar[i]==schar[j]){
                    mery[i][j]=true;
                }else if (schar[i]==schar[j]&&mery[i+1][j-1]){
                    mery[i][j]=true;

                }
                if(mery[i][j]&&L>maxlen){
                    maxlen=L;
                    begin=i;
                }
            }
        }

    }
}
