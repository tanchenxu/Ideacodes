package com.akuya.RealProblem;

import java.util.Scanner;

/**
 * @description 问题描述
 *
 * 小蓝有一个插板，形状用一个 n * m 的01矩阵表示，0 表示板面，1 表示插孔。
 * 小蓝还有一个插头，形状用一个 r * c 的01矩阵表示，0 表示没有伸出的部分，1 表示伸出的部分。插头伸出的部分必须插在插孔里面。
 * 为了安全，插头插到面板上不能有任何部分超过插板边界（包括没有伸出的部分）。
 * 插头和插板都不能旋转，也不能翻转。请求出插头插入插板的合理位置。
 * 输入格式
 * 输入的第一行包含两个整数 n, m。
 * 接下来 n 行，每行一个长度为 m 的01串，表示插板的形状。
 * 接下来一行包含两个整数 r, c。
 * 接下来 r 行，每行一个长度为 c 的01串，表示插头的形状。
 * 输出格式
 * 如果插头没办法安全插入插板中，输出“NO”。否则输出两个数 a, b，表示插头的第 1 行第 1 列对应插板的第 a 行第 b 列。如果有多种情况满足要求，输出 a 最小的方案，如果 a 最小的方案有多个，输出在 a 最小的前提下 b 最小的方案。
 * 样例输入
 * 3 4
 * 0110
 * 0000
 * 0000
 * 3 3
 * 000
 * 010
 * 000
 * 样例输出
 * NO
 * 样例说明
 * 在插头不超出范围的前提下无法插入。
 * 样例输入
 * 4 7
 * 1110100
 * 1101111
 * 0001111
 * 0000011
 * 2 3
 * 111
 * 011
 * 样例输出
 * 2 4
 * @author akuya
 * @create 2022-03-27-17:54
 */
public class Socket {
    static int soy,sox,ply,plx;
    static int socket[][],plug[][];
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
         soy = scanner.nextInt();
         sox = scanner.nextInt();
         socket = new int[soy][sox];
        for (int i = 0; i < soy; i++) {
            for (int j = 0; j < sox; j++) {
                socket[i][j] = scanner.nextInt();//0为板子，1为孔
            }
        }
         ply = scanner.nextInt();
         plx = scanner.nextInt();
         plug = new int[ply][plx];
        for (int i = 0; i < ply; i++) {
            for (int j = 0; j < plx; j++) {
                plug[i][j] = scanner.nextInt();//0为板子，1为头
            }
        }

        if(ply>soy||plx>sox){
            System.out.println("NO");
            return;
        }

        for(int i=0;i<=soy-ply;i++){
            for(int j=0;j<=sox-plx;j++){
                if(isOK(i,j)){
                    System.out.print(i+1+" ");
                    System.out.println(j+1+" ");
                    long end = System.currentTimeMillis();
                    System.out.println("共耗时"+(end-start)+"毫秒");
                    return;
                }
            }
        }

        System.out.println("NO");
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");
    }

    public static boolean isOK(int a,int b) {
        for(int i=0;i<ply;i++){
            for(int j=0;j<plx;j++){
                if(plug[i][j]==1&&socket[i+a][j+b]==0)
                    return false;
            }
        }

    return true;
    }
}
