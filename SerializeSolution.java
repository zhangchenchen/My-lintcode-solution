/**
 * Definition of TreeNode:

 */
class SerializeSolution {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
      public static  class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
 }
    public static String serialize(TreeNode root) {
        // write your code here
        String res = "";
        if(root == null){
            return res + "#";
        }
        else{
            return root.val +""+ serialize(root.left) + serialize(root.right);
        }
    }
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
     public static TreeNode deserialize(String data) {
        String[] dataArr = data.trim().split("\\s+");
        return deserialize(dataArr);
    }
    static int index = 0; 
    public static TreeNode deserialize(String[] dataArr) {
        // write your code here
        if (index >= dataArr.length){
            return null;
        }
        if (dataArr[index].equals("#")) {
            index++;
            return null;
        }
        System.out.println(dataArr[index]);
        int value = Integer.parseInt(dataArr[index]);
        TreeNode tree = new TreeNode(value);
        index++;
        tree.left = deserialize(dataArr);
        tree.right = deserialize(dataArr);
        return tree;
    }
        private static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        // TreeNode node2 = new TreeNode(20);
        // TreeNode node3 = new TreeNode(50);
        // TreeNode node4 = new TreeNode(45);
        // TreeNode node5 = new TreeNode(35);
        root.left = null;
        root.right = node1;
        // node1.left = node3;
        // node2.left = node4;
        // node2.right = node5;

        //System.out.println(serialize(root));
        TreeNode node = deserialize("1#2");
        //inorder(node);
    }
}

