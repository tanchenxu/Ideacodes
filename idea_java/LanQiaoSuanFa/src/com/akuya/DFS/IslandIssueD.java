package com.akuya.DFS;

import java.util.Scanner;

/**
 * @description 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-islands
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author akuya
 * @create 2022-03-25-14:43
 */
public class IslandIssueD {
    static int number=0;
    static int move[][]={{0,1,0,-1},{1,0,-1,0}};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();//长
        int wide = scanner.nextInt();//宽
        int sea[][] = new int[wide][length];//1为陆地，0位海洋
        boolean island[][] = new boolean[wide][length];
        for (int i = 0; i < wide; i++) {
            for (int j = 0; j < length; j++) {
                sea[i][j] = scanner.nextInt();
            }

        }
        for(int i=0;i<wide;i++){
            for(int j=0;j<length;j++){
                if(sea[i][j]==1&&!island[i][j]){
                    number++;
                    island[i][j]=true;
                    dfs(i,j,sea,island);
                }
            }
        }
        System.out.println("岛屿的个数为="+" "+number);
    }

    public static void dfs(int startx,int starty,int sea[][],boolean island[][]){
        for(int i=0;i<4;i++){
            if((startx+move[1][i])<sea[0].length&&(startx+move[1][i])>=0&&(starty+move[0][i])<sea.length&&(starty+move[0][i])>=0){
            if(sea[starty+move[0][i]][startx+move[1][i]]==1&&!island[starty+move[0][i]][startx+move[1][i]]){
                island[starty+move[0][i]][startx+move[1][i]]=true;
                dfs(starty+move[0][i],startx+move[1][i],sea,island);
            }}
        }


    }

}