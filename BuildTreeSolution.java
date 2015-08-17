import java.util.*;
public class BuildTreeSolution {
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
    /**
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if(preorder == null || preorder.length == 0){
            return null;
        }
        return buildTree(preorder,inorder,0,0,preorder.length-1);
    }
    public TreeNode buildTree(int[] preorder,int[] inorder, int preindex, int inbeg,int inend){
        if( inbeg > inend){
            return null;
        }
        TreeNode node = new TreeNode(preorder[preindex]);
        if(inbeg == inend){
            return node;
        }
        int inmid = search(inorder,preorder[preindex]);
        preindex++;
        node.left = buildTree(preorder,inorder,preindex,inbeg,inmid -1);
        node.right = buildTree(preorder,inorder,preindex,inmid + 1,inend);
        return node;
    }
    public int search(int[] order,int m){
        for(int i = 0 ;i < order.length;i++){
            if(order[i] == m){
                return i;
            }
        }
        return -1;
    }
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



