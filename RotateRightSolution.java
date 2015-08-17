 
public class RotateRightSolution {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode helper = head;
        int count = 0;
        while(helper != null){
            helper = helper.next;
            count++;
        }
        if(k >= count ){
            k = count - k/count;
        }
        if(k == 0){
            return head;
        }
        //k = count - k/count;
        int i = 0;
        while(i < k){
            i++;
            p2 = p2.next;
            if( p2.next == null){
                p2 = head;
            }
        }
        if(p2 == null || p2.next == null){
            return head;
        }
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = head;
        preHead.next = p1.next;
        p1.next = null;
        return preHead.next;
    }
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        ArrayList<Integer> A = new ArrayList<Integer>();
        A = 
        //Integer a = new Integer(1);
        
        System.out.println(rotateRight(A));
    }
}



