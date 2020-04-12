package com;

import java.util.List;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/4/8 16:09
 * @Project suanfa
 */
/*
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        输出：7 -> 0 -> 8
        原因：342 + 465 = 807*/
public class AddTwo {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        listNode1.next = new ListNode(7);
//        listNode1.next.next = new ListNode(9);
        ListNode listNode2 = new ListNode(9);

        listNode2.next = new ListNode(2);
//        listNode2.next.next = new ListNode(4);
        /*while (listNode1 != null){
            if (listNode1.next != null){
                System.out.print(listNode1.val + "->");
            }else
                System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
        while (listNode2 != null){
            if (listNode2.next != null){
                System.out.print(listNode2.val + "->");
            }else
                System.out.println(listNode2.val);
            listNode2=listNode2.next;
        }*/
        ListNode resultListNode = addTwoNumbers(listNode1, listNode2);
        while (resultListNode != null) {
            if (resultListNode.next != null) {
                System.out.print(resultListNode.val + "->");
            } else
                System.out.println(resultListNode.val);
            resultListNode = resultListNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(0);
        ListNode deleteZero = resultListNode;
        ListNode finishListNode = resultListNode;
        while (l1 != null && l2 != null) {
            int resultBaseTemp = l1.val + l2.val + resultListNode.val;
            resultListNode.next = new ListNode(0);
            resultListNode.val = resultBaseTemp % 10;
            if (resultBaseTemp >= 10) {
                resultListNode.next.val += 1;
            }
            l1 = l1.next;
            l2 = l2.next;
            resultListNode = resultListNode.next;
        }
        if (l1 != null){
            while ( l1 != null){
                int resultBaseTemp = resultListNode.val + l1.val;
                resultListNode.next = new ListNode(0);
                resultListNode.val = resultBaseTemp % 10;
                if (resultBaseTemp >= 10) {
                    resultListNode.next.val += 1;
                }
                l1 = l1.next;
                resultListNode = resultListNode.next;
            }
        }
        if (l2 !=null){
            while ( l2 != null){
                int resultBaseTemp = resultListNode.val + l2.val;
                resultListNode.next = new ListNode(0);
                resultListNode.val = resultBaseTemp % 10;
                if (resultBaseTemp >= 10) {
                    resultListNode.next.val += 1;
                }
                l2 = l2.next;
                resultListNode = resultListNode.next;
            }
        }
        if (resultListNode.val == 0){
            while (deleteZero != null) {
                if (deleteZero.next.val == 0 && deleteZero.next.next == null){
                    deleteZero.next = null;
                    break;
                }
                deleteZero = deleteZero.next;
            }
        }
        return finishListNode;

    }
}
