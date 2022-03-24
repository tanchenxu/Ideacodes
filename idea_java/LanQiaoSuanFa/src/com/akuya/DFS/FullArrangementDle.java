package com.akuya.DFS;

import java.util.*;

/**
 * @description 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 * @author akuya
 * @create 2022-03-23-18:58
 * @harvest 懂得了map的使用，并且浅层次了解到了foreach方法的使用
 */
public class FullArrangementDle {
    static List<List<Integer>> result=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number =scanner.nextInt();
        int test[]=new int[number];
        for(int i=0;i<number;i++){
            test[i]=scanner.nextInt();
        }
        Map<Integer,Integer> m=new HashMap();
        for(int i:test){
            m.put(i,m.containsKey(i)?m.get(i)+1:1);
        }

        int SIZE=m.size();
        int key[]=new int[SIZE];
        int values[]=new int[SIZE];
        int index[]=new int[1];
        m.forEach((k,v)->{
          key[index[0]]=k;
          values[index[0]]=v;
          index[0]++;
        });

        dfs(number,key,values,new ArrayList<Integer>());

        for(List<Integer> list:result){
            for(int i:list){
                System.out.print(i);
            }
            System.out.print("/");
        }
    }

    public static void dfs(int number,int key[],int values[],List<Integer> chain){
        if(chain.size()==number){
            result.add(new ArrayList(chain));
            return;
        }

        for(int i=0;i<key.length;i++){
            if(values[i]!=0){
                chain.add(key[i]);
                values[i]--;
                dfs(number,key,values,chain);
                chain.remove(chain.size()-1);
                values[i]++;
            }
        }
    }
}
