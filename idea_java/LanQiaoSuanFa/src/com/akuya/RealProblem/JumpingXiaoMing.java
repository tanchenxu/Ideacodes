package com.akuya.RealProblem;

/**
 * @author akuya
 * @create 2022-04-06-19:51
 */
import java.util.Arrays;
import java.util.Scanner;

public class JumpingXiaoMing {
    static int n, p, t;// 长度，最大行动距离，步数；
    static int value[];
    static int mery[][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        p = scanner.nextInt();
        t = scanner.nextInt();
        value = new int[1010];
        mery=new int [1010][1010];
        for (int i = 1; i <= n; i++) {
            value[i] = scanner.nextInt();
        }
        if (t == 0) {
            System.out.println("Error!");
            return;
        }
        for(int[] a:mery) {
            Arrays.fill(a,-0x3f3f3f);
        }
        dp();
        System.out.println(mery[t][n+1]);
    }

    public static void dp() {

        for (int i = 1; i <= p; i++) {
            mery[1][i] = value[i];
        }

        for (int i = 2; i <= t; i++) {
                for (int j = i; j <=n+1; j++) {
                    if(j<=p){
                        for(int k=1;k<j;k++){
                            mery[i][j]=Math.max(mery[i-1][j-k]+value[j],mery[i][j]);
                        }
                    }else{
                        for (int k = 1; k <= p; k++) {
                            mery[i][j]=Math.max(mery[i-1][j-k]+value[j],mery[i][j]);
                        }
                    }
                }
            }
        }
    }
