/*
package kw.letcode;

public class Demo02 {
    */
/**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *//*

 }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cJinwei = 0;
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        ListNode node = new ListNode(0);
        ListNode root = node;
        while ((l1 != null) || (l2 != null)) {
            num1 = 0;
            num2 = 0;
            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }
            count = num1 + num2 + cJinwei;
            cJinwei = count / 10;
            ListNode sumNode = new ListNode(count % 10);
            node.next = sumNode;
            node = sumNode;
        }
        if (cJinwei != 0) {
            ListNode sumNode = new ListNode(cJinwei);
            node.next = sumNode;
            node = sumNode;
        }
        return root.next;
    }

}*/
