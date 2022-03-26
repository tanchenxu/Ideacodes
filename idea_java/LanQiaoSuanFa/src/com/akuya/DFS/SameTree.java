package com.akuya.DFS;

import java.util.Scanner;

/**
 * @description
给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。

如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。


 * @author akuya
 * @create 2022-03-25-18:43
 */


//由于自己创建二叉树进行测试过于麻烦，之后的二叉树题统一只写方法。


    public class SameTree {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            TreeNode t1=new TreeNode();
            TreeNode t2=new TreeNode();
            t1.val=scanner.nextInt();
            TreeNode left1=new TreeNode();
            t1.left=left1;
            t1.left.val=scanner.nextInt();
            TreeNode right1=new TreeNode();
            t1.right=right1;
            t1.right.val=scanner.nextInt();

            t2.val=scanner.nextInt();
            TreeNode left2=new TreeNode();
            t2.left=left2;
            t2.left.val=scanner.nextInt();
            TreeNode right2=new TreeNode();
            t2.right=right2;
            t2.right.val=scanner.nextInt();

            System.out.println(dfs(t1,t2));
        }

        public static boolean dfs(TreeNode t1,TreeNode t2){
            if(t1==null&&t2==null){
                return true;
            }
            if (t1==null||t2==null){
                return false;
            }

            return t1.val==t2.val&&dfs(t1.left,t2.left)&&dfs(t1.right,t2.right);
        }

    }
