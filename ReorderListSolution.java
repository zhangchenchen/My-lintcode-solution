import java.util.*;
public class ReorderListSolution {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
          this.next = null;
      }
  }
    public static void print(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
            
    }
    public static void reorderList(ListNode head){
        if(head == null || head.next == null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list1 = head;
        ListNode list2 = slow.next;
        slow.next = null;
        //reverse list2
        ListNode list2Pre = null;
        ListNode list2Aft = list2;
        while(list2Aft != null){
            ListNode temp = list2Aft.next;
            list2Aft.next = list2Pre;
            list2Pre = list2Aft;
            list2Aft = temp;
        } 
        
        //merge two lists
        list2 = list2Pre;
        print(list1);
        print(list2);
        ListNode p = list1;
        ListNode q = list2;
        while(p != null && q != null){
            ListNode temp1 = p.next;
            ListNode temp2 = q.next;
            p.next = q;
            q.next = temp1;
            p = temp1;
            q = temp2;
        }
    }
        public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        //ArrayList<Integer> A = new ArrayList<Integer>();
        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(-1);
        ListNode node2 = new ListNode(0);
        head.next = node1;
        node1.next  = node2;
        node2.next = null;
        //Integer a = new Integer(1);
        reorderList(head);
    }
}



