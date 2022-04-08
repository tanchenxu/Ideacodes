package com.akuya.RealProblem;

/**
 * @author akuya
 * @create 2022-04-08-19:11
 */
import java.util.ArrayList;
import java.util.List;

public class TestD {
    static int result =0;
    static long n =2021041820210418L;
    public static void main(String[] args) {
        long starttime =System.currentTimeMillis();
        List<Long> list=new ArrayList<Long>();

        for(Long l=1L;l<(int)Math.sqrt(n);l++) {
            if(n%l==0) {
                list.add(l);
                list.add(n/l);
            }
        }
        /*int cnt=0;
        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<list.size(); j++) {
                for (int k=0; k<list.size(); k++) {
                    if (list.get(i) * list.get(j) * list.get(k) == n) {
                        cnt++;
                    }
                }
            }
        }*/
        dfs(list,1,1L);
        System.out.println(result);
        long endtime = System.currentTimeMillis();
        System.out.println("程序运行的时间为："+(endtime-starttime)+"毫秒");


    }
    public static void dfs(List<Long> list,int level,Long temp) {
        if(level==4) {
            if(temp==n) {
                result++;
            }
            return;
        }

        for(int i=0;i<list.size();i++){
            dfs(list,level+1,temp*list.get(i));
        }
    }
}