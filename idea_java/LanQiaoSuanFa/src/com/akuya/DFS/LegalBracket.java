package com.akuya.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-03-24-23:24
 */
public class LegalBracket {
    static List<String> result =new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();//括号数量
        StringBuilder str =new StringBuilder();
        int brack[]=new int[2];
        brack[0]=number;
        brack[1]=number;
        dfs(number,str,brack);
        for(String s:result){
            System.out.println(s);
        }

    }

    public static void dfs(int number,StringBuilder str,int []brack){

      if(str.length()==number*2) {
          result.add(str.toString());
          return;
      }

        if(brack[0]!=0){
            str.append("(");
            brack[0]--;
            dfs(number,str,brack);
            brack[0]++;
        }

        if(brack[1]!=0&&brack[0]!=brack[1]){
            str.append(")");
            brack[1]--;
            dfs(number,str,brack);
            brack[1]++;
        }
    }

}
