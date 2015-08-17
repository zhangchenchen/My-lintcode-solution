public class RemoveNodeSolution {
    /**
     * @param root: The root of the binary search tree.
     * @param value: Remove the node with given value.
     * @return: The root of the binary search tree after removal.
     */
     public static class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
    static TreeNode parent;
    static int tag ;
    public static TreeNode removeNode(TreeNode root, int value) {
        // write your code here
        parent = null;
        tag = 0;
        if(root == null){
            return null;
        }
        TreeNode node = findNode(root,value);
        System.out.println(node.val+"###"+tag);
        //situation 1 : no such a node,do nothing
        if(node == null){
            return root;
        }
        //situation2 : node only have less than two subtree 
        if(node.left == null || node.right == null){
            if(parent == null){
                return null;
            }
            if(tag == 1){
                if(node.left != null){
                    parent.left = node.left;
                }
                else if(node.right != null){
                    parent.left = node.right;
                }
                else{
                    parent.left = null;
                }
            }
            if(tag == -1){
                if(node.left != null){
                    parent.right = node.left;
                }
                else if(node.right != null){
                    parent.right = node.right;
                }
                else{
                    parent.right = null;
                }
            }
        }
        //situation 3  :node has two subtree, recursive
        if(node.left != null && node.right != null){
            node.val = node.left.val;
            node.left = removeNode(node.left, node.left.val);
        }
        return root;
    }
    public static TreeNode findNode(TreeNode root, int value){
        if(root != null){
            if(root.val > value){
                parent = root;
                tag = 1;
                 return findNode(root.left, value);
            }
            if(root.val < value){
                parent = root;
                tag = -1;
                return findNode(root.right,value);
            }
            if(root.val == value){
                //System.out.println(root.val);
                return root;
            }
        }
        return null;
    }
       public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
         TreeNode node2 = new TreeNode(3);
         TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
         //TreeNode node5 = new TreeNode(35);
        root.left = null;
        root.right = node1;
        node1.left = null;
        node1.right = node2;
        node2.left = null;
        node2.right = node3;
        node3.left = null;
        node3.right = node4;
        node4.left = null;
        node4.right = null;
        //System.out.println(serialize(root));
        TreeNode node = removeNode(root, 3);
        //inorder(node);
    }
}
