package com.akuya.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * @author akuya
 * @create 2022-03-22-21:38
 */
public class FullArrangement {

    static List<String> list=new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        int [] Arrays=new int[number];
        for(int i=0;i<number;i++){
            Arrays[i]=scanner.nextInt();
        }
        StringBuilder str =new StringBuilder();
        int mery[]=new int[number];
        dfs(Arrays,str,mery);
        for(String s:list){
            System.out.print(s+" ");
        }
    }

    public static void dfs(int[] Arrays, StringBuilder str,int mery[] ){
        if(str.length()==Arrays.length){
            list.add(str.toString());
            return;
        }

        for(int i=0;i<Arrays.length;i++){
            if(mery[i]==0){
                str.append(Arrays[i]);
                mery[i]=1;
                dfs(Arrays,str,mery);
                mery[i]=0;
                str.deleteCharAt(str.length()-1);
            }
        }
    }

}
