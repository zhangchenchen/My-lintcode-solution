public class CopyRandomListSolution {
    public static class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };
    public static void print(RandomListNode head){
        while(head != null){
            System.out.println(head.label);
            head = head.next;
        }
    }
    public static RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return null;
        }
        RandomListNode p = head;
        while(p != null){
            RandomListNode newNode = new RandomListNode(p.label);
            newNode.next = p.next;
            p.next = newNode;
            p = p.next.next;
        }
        p = head;
        while(p != null){
            RandomListNode temp = p.next;
            if(p.random != null){
                temp.random = p.random.next;
            }
            p = temp.next;
        }
        print(head);
        RandomListNode newHead = head.next;
        p = head;
        while(p != null){
            RandomListNode temp = p.next;
            p.next = temp.next;
            if(temp.next != null){
                temp.next = temp.next.next;
            }
            p = p.next;
        }
        return newHead;
    }
        public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        //ArrayList<Integer> A = new ArrayList<Integer>();
        RandomListNode head = new RandomListNode(-1);
        RandomListNode node = new RandomListNode(1);
        head.next = node;
        node.next  = null;
        head.random = null;
        node.random = null;
        //Integer a = new Integer(1);
        print(copyRandomList(head));
    }
}



