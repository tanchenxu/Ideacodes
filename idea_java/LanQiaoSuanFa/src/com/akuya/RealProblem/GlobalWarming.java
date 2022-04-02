package com.akuya.RealProblem;

/**
 * @author akuya
 * @create 2022-03-31-21:23
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int x;
    int y;
    int val;
}

public class GlobalWarming {
    static boolean flag=false;
    static Node node;
    static int wide;
    static int length;
    static int movex[]={1,0,-1,0};
    static int movey[]={0,1,0,-1};
    static boolean mery[][];
    static int number=0;
    public static void main(String[] args) {
        node = new Node();
        Scanner scanner = new Scanner(System.in);
        wide = scanner.nextInt();
        length = scanner.nextInt();
        mery = new boolean[wide][length];
        int area[][] = new int[wide][length];
        for (int i = 0; i < wide; i++) {
            for (int j = 0; j < length; j++) {
                area[i][j] = scanner.nextInt();//1为岛屿，0为海洋
            }
        }

        for (int i = 0; i < wide; i++) {
            for (int j = 0; j < length; j++) {
                if (area[i][j] == 1 && !mery[i][j]) {
                    bfs(area, i, j);
                    if (!flag) {
                        number++;
                        flag = false;

                    }

                }
            }
        }
        System.out.println(number);
        scanner.close();
    }
        private static void bfs ( int area[][], int x, int y){
            Queue<Node> queue = new LinkedList<Node>();
            node.x = x;
            node.y = y;
            queue.offer(node);
            mery[x][y] = true;
            while (!queue.isEmpty()) {
                Node top = queue.poll();
                if (area[top.y + movey[0]][top.x + movex[0]] == 1 && area[top.y + movey[1]][top.x + movex[1]] == 1
                        && area[top.y + movey[2]][top.x + movex[2]] == 1 && area[top.y + movey[3]][top.x + movex[3]] == 1) {
                    flag = true;
                }
                for (int i = 0; i < 4; i++) {
                    if ((top.x + movex[i]) < area[0].length && (top.x + movex[i]) >= 0 && (top.y + movey[i]) < area.length
                            && (top.y + movey[i]) >= 0) {
                        if (area[top.y + movey[i]][top.x + movex[i]] == 1 && !mery[top.y + movey[i]][top.x + movex[i]]) {
                            mery[top.y + movey[i]][top.x + movex[i]] = true;
                            Node nodenew = new Node();
                            nodenew.x = top.x + movex[i];
                            nodenew.y = top.y + movey[i];
                            queue.offer(nodenew);
                        }
                    }

                }

            }

        }

}



