import java.util.*;
public class PostorderTraversalSolution {
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public static class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
    public static ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here

        Stack<TreeNode> stackHelper = new Stack<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        stackHelper.push(root);
        TreeNode curr ; 
        while(!stackHelper.empty()){
            curr = stackHelper.peek();
            if(curr != null){
                //System.out.println(curr.val);
                if( (curr.left != null && !res.contains(curr.left.val)) || (curr.right != null && !res.contains(curr.right.val))){
                    if(curr.right != null && !res.contains(curr.right.val)){
                        stackHelper.push(curr.right);
                    //System.out.println(curr.left.val);
                    }
                    if(curr.left != null && !res.contains(curr.left.val)){
                        stackHelper.push(curr.left);
                    //System.out.println(curr.right.val);
                    }
                } 
                else{
                    stackHelper.push(null);
                }
            }
            else{
                stackHelper.pop();
                System.out.println(stackHelper.peek().val);
                res.add(stackHelper.pop().val);
            }
        }
        return res;
    }
    public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        //ArrayList<Integer> A = new ArrayList<Integer>();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
          TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = null;
        node2.right = node5;
        node3.left = null;
        node3.right = null;
        node4.left = null;
        node4.right = null;
        node5.left = node6;
        node5.right = null;
        node6.left = null;
        node6.right = null;

        //Integer a = new Integer(1);
        postorderTraversal(root);
    }
}



