package com.akuya.DFS;

import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-03-18-21:17
 */
public class EasyTest {
    static int mery[]=new int[100];

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder str=new StringBuilder();
        int number=scanner.nextInt();
        String letter[]=new String[number+1];
        for(int i=1;i<=number;i++){
            letter[i]=scanner.next();
        }
        int level=1;
        StringBuilder temp=new StringBuilder();
        dfs(letter,level,str,temp);
        System.out.println(str);
    }

    public static void dfs(String letter[],int level,StringBuilder str,StringBuilder temp){

        if(level>=letter.length){
            str.append(temp);
            str.append(" ");
        }

        for(int i=1;i<letter.length;i++){
            if(mery[i]!=1){
                temp.append(letter[i]);
                mery[i]=1;
                dfs(letter,level+1,str,temp);
                temp.deleteCharAt(temp.length()-1);
                mery[i]=0;
            }
        }
    }

}
