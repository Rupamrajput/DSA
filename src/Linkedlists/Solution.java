package Linkedlists;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(2);
        list.set(0,"hii");
        System.out.println(list.get(0));
    }



    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode temp = head.next;

        if(head.next.next!=null) {
            head.next = head.next.next;
            temp.next = head;

            ListNode result = temp;
            ListNode tail = head;
            ListNode move = head.next;
            while (move.next !=null){
                if(move.next.next!=null){
                    temp = move.next;
                    move.next = move.next.next;
                    temp.next = move;
                    tail.next = temp;

                    tail = temp.next;
                    move = tail.next;
                }
                else {
                    tail.next = move.next;
                    tail.next.next = move;
                    move.next = null;
                }
            }
            return result;
        }
        else {
            temp.next = head;
            head.next = null;
            return temp;
        }
    }
}
