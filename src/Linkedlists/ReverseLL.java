package Linkedlists;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class ReverseLL {
  public static ListNode reverseList(ListNode head) {
    if (head== null || head.next==null){
      return head;
    }
    ListNode l = reverseList(head.next);
    head.next.next=head;
    head.next = null;
    return l;
  }
}

class MultiplyLL{
  public static void main(String[] args) {
    ListNode l1 = new ListNode(9);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(6);
    ListNode l2 = new ListNode(8);
    l2.next = new ListNode(4);
    System.out.println(multiply(l1,l2));
  }

   public static long multiply(ListNode l1, ListNode l2){
     l1 = ReverseLL.reverseList(l1);
     l2 = ReverseLL.reverseList(l2);
     ListNode temp1 = l1;
     if(l1==null || l2 == null) return -1L;
     long res = 0;
     int multiple = 1;
     while (l2!=null){
       l1 = temp1;
       int number = l2.val;
       int presentValue = 0;
       int mul = 1;
       int rem = 0;
       while (l1!=null){
         int noToAdd = ((number*l1.val)+rem)%10;
         rem = ((number*l1.val)+rem)/10;
         presentValue +=noToAdd*mul;
         mul*=10;
         l1 = l1.next;
       }
       presentValue += mul*rem;
       res+= (long) presentValue *multiple;
       multiple*=10;
       l2 = l2.next;
     }
     return res;
   }
}
