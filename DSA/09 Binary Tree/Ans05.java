public class Ans05 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.val = data;
            left = null;
            right = null;
        }
    }

    public static void preOrder(TreeNode root) {
        if(root == null)
            return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void mirrorTree(TreeNode root) {
        if(root == null)
            return;
        

        // swap 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;


        mirrorTree(root.left);
        mirrorTree(root.right);
    }


    public static void main(String[] args) {
        Ans05 p = new Ans05();
        Ans05.TreeNode root = p.new TreeNode(1);
        root.left = p.new TreeNode(2);
        root.right = p.new TreeNode(3);
        root.left.left = p.new TreeNode(4);
        root.left.right = p.new TreeNode(5);
        root.right.left = p.new TreeNode(6);
        root.right.right = p.new TreeNode(7);
        mirrorTree(root);
        preOrder(root);

    }
}
