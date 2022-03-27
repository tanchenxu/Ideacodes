package com.akuya.RealProblem;

import java.util.Scanner;

/**
 * @DESCRIPTION 对于一个 n 行 m 列的表格，我们可以使用螺旋的方式给表格依次填上正整数，我们称填好的表格为一个螺旋矩阵。
 * 例如，一个 4 行 5 列的螺旋矩阵如下：
 * 1 2 3 4 5
 * 14 15 16 17 6
 * 13 20 19 18 7
 * 12 11 10 9 8
 * 请问，一个 30 行 30 列的螺旋矩阵，第 20 行第 20 列的值是多少？
 * ————————————————
 * 版权声明：本文为CSDN博主「执 梗」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/m0_57487901/article/details/123684040
 * @author akuya
 * @create 2022-03-27-15:45
 */
public class SuperLargeJadeSpiralPill {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int clip[][]=new int [n][m];
      int num=1;
      int target=n*m;
      int r=0,d=m-1,l=0,t=n-1;
      while(num<=target){
          for(int i=l;i<=d;i++){
              clip[r][i]=num++;
          }
          r++;
          for(int i=r;i<=t;i++){
              clip[i][d]=num++;
          }
          d--;
          for(int i=d;i>=l;i--){
              clip[t][i]=num++;
          }
          t--;
          for(int i=t;i>=r;i--){
              clip[i][l]=num++;
          }
          l++;
      }
      int ty=scanner.nextInt();
      int tx=scanner.nextInt();

        System.out.println(clip[ty-1][tx-1]);


    }
}
