package com.akuya.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description 在深度搜索中做过类似的题，此处用bfs进行操作
 * @author akuya
 * @create 2022-03-25-20:01
 */


public class Maze {
    static int x,y;
    static int move[][]={{0,1,0,-1},{1,0,-1,0}};
    static Node node =new Node();
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
        int result=dfs(0,0,node,mery,maze);
        System.out.println(result);
    }

    public static int  dfs(int startx,int starty,Node node,boolean mery[][],int maze[][]){
        Queue<Node> queue=new LinkedList<Node>();
        node.val=0;
        node.x=startx;
        node.y=starty;
        queue.offer(node);
        mery[node.y][node.x]=true;
        while(!queue.isEmpty()){
            Node top=queue.poll();
            if(top.x==x&&top.y==y){
                return top.val;
            }
            for(int i=0;i<4;i++){
                if((top.x+move[1][i])<maze[0].length&&(top.x+move[1][i])>=0&&(top.y+move[0][i])<maze.length&&(top.y+move[0][i])>=0){
                    if(maze[top.y+move[0][i]][top.x+move[1][i]]==0&&!mery[top.y+move[0][i]][top.x+move[1][i]]) {
                        Node node1=new Node();
                        node1.x=top.x+move[1][i];
                        node1.y=top.y+move[0][i];
                        node1.val=top.val+1;
                        mery[node1.y][node1.x]=true;
                        queue.offer(node1);
                    }
                    }
            }

        }
     return -1;
    }
}
