package com.akuya.DFS;

import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-03-18-18:10
 */
public class MazePath {
    static int x, y, min = Integer.MAX_VALUE;//终点与记录最少步数
    static int mery[][];
    static int sx[] = {0,0, 1, 0, -1};
    static int sy[] = {0,1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Width = scanner.nextInt();
        int Length = scanner.nextInt();
        int step = 0;//记录已走步数
        int nx = 1, ny = 1;//目前坐标
        mery = new int[100][100];//0为未走过，1为走过；
        x = scanner.nextInt();
        y = scanner.nextInt();
        int maze[][] = new int[Width+2][Length+2];
        for (int i = 1; i <= Width; i++) {
            for (int j =1; j <= Length; j++) {
                maze[i][j] = scanner.nextInt();//1为无障碍，2为有障碍。
            }
        }
        mery[1][1]=1;
        path(nx,ny,step,maze);
        System.out.println(min);

    }

    public static void path(int px, int py, int step, int maze[][]) {
        if (px == x && py == y) {
            if (step < min) {
                min = step;
                return;
            }
        }

        //开始顺时针判断
        for (int i = 1; i <= 4; i++) {
            if (maze[px+sx[i]][py + sy[i]] == 1 && mery[px+sx[i]][py + sy[i]] == 0) {
                mery[px+sx[i]][py + sy[i]]=1;
                path(px+sx[i],py + sy[i],step+1,maze);
                mery[px+sx[i]][py + sy[i]]=0;
            }
        }
        return;
    }
}