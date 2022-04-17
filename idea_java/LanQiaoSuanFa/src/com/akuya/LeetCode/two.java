package com.akuya.LeetCode;


/**
 * @description 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author akuya 这道题运用了java的链表
 * 我对链表不太熟悉所以做不出来
 * 大概格式为
 * 先创建头链表
 * 再创建指正链表指向头链表
 * 之后进行链表操作
 * 最后返回头链表.next
 * @create 2022-04-17-14:04
 */
public class two {





/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head =new ListNode(-1),pre=head;
            int temp=0;
            while(l1!=null||l2!=null||temp!=0){
                if(l1!=null){
                    temp+=l1.val;
                    l1=l1.next;
                }
                if(l2!=null){
                    temp+=l2.val;
                    l2=l2.next;
                }
                pre.next=new ListNode(temp%10);
                pre=pre.next;
                temp/=10;
            }
            return head.next;
        }
    }













     */
}