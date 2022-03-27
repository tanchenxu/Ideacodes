package com.akuya.RealProblem;

import java.util.Scanner;

/**
 * @description 有一个整数 A=2021，每一次，可以将这个数加 1 、减 1 或除以 2，其中除以 2 必须在数是偶数的时候才允许。
 * 例如，2021 经过一次操作可以变成 2020、2022。
 * 再如，2022 经过一次操作可以变成 2021、2023 或 1011。
 * 请问，2021 最少经过多少次操作可以变成 1。
 * ————————————————
 * 版权声明：本文为CSDN博主「执 梗」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/m0_57487901/article/details/123684040
 * @author akuya
 * @create 2022-03-27-14:30
 */
public class TheLeastTime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int origin=scanner.nextInt();
        int target=scanner.nextInt();
        int mery[]=new int[origin +1];
        for(int i=0;i<=origin;i++){
            mery[i]=Integer.MAX_VALUE-1;
        }
        DP(origin,target,mery);
        System.out.println(mery[origin]);
    }
    public static void DP(int origin ,int target,int mery[]){
        if(target>=origin) {
        mery[target]=target-origin;
        }else{
        mery[target]=0;
        mery[target+1]=1;
        if(target!=0&&target*2<=origin){
            mery[target*2]=1;
        }
        for(int i=target+2;i<=origin;i++){

            if(i%2==0&&i/2>=target&&i<origin) {
                mery[i]=Math.min(mery[i-1]+1,Math.min(mery[i/2]+1,mery[i+1]+1));
            }else if(i%2!=0&&i!=origin){
                mery[i] = Math.min(mery[i - 1] + 1,mery[i+1]+1);
            }else if(i%2==0&&i/2>=target&&i==origin){
                mery[i]=Math.min(mery[i-1]+1,mery[i/2]+1);
            }else if(i%2!=0&&i==origin){
                mery[i]=mery[i-1]+1;
            }
            if(i*2<=origin){
                mery[i*2]=mery[i]+1;
            }
        }

    }
    }
}
/*public class TheLeastTime {
    public static void main(String[] args) {
        //数组开个10000完全够用了
        boolean[] visit=new boolean[10000];
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(2021);
        visit[2021]=true;
        //记录答案
        int time=0;
        //BFS模板走起
        while(!queue.isEmpty()) {
            int size=queue.size();
            while(size-->0) {
                int curr=queue.poll();
                //判断curr如果是1则直接输出time就是我们的答案
                if(curr==1) {
                    System.out.println(time);//14
                    return;
                }
                if(!visit[curr+1]) {
                    visit[curr+1]=true;
                    queue.offer(curr+1);
                }
                if(!visit[curr-1]) {
                    visit[curr-1]=true;
                    queue.offer(curr-1);
                }
                //一定要记住,只有偶数才可以选择除以2的操作
                if(curr%2==0&&!visit[curr/2]) {
                    visit[curr/2]=true;
                    queue.offer(curr/2);
                }
            }
            time++;
        }
    }
}*/