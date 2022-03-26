package com.akuya.DFS;

/**
 * @description 最为二叉树类型题的基础
 * @author akuya
 * @create 2022-03-25-18:51
 */
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}