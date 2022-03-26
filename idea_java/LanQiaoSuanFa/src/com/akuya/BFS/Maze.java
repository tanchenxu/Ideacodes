package com.akuya.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description 在深度搜索中做过类似的题，此处用bfs进行操作
 * @author akuya
 * @create 2022-03-25-20:01
 */
class Path{
    int x;
    int y;
}


public class Maze {
    static int x,y,min=0;
    static int movex[]={1,0,-1,0};
    static int movey[]={0,1,0,-1};
    static Path path=new Path();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();//目的地
        y=scanner.nextInt();//目的地
        int length=scanner.nextInt();//迷宫长
        int wide=scanner.nextInt();//迷宫宽
        int maze[][]=new int[wide][length];//其中0为空地，1为障碍。
        for(int i=0;i<wide;i++){
            for(int j=0;j<length;j++){
                maze[i][j]=scanner.nextInt();
            }
        }
        boolean mery[][]=new boolean[wide][length];

    }

    public static void dfs(int startx,int starty,Path path,boolean mery[][],int maze[][]){
        Queue<Node> queue=new LinkedList<Node>();
        queue.offer()



    }
}
