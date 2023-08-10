public class question04 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode prev;

    public void traversal(TreeNode root, int k) {
        if (root == null)
            return;

        traversal(root.left, k);
        if (k == root.val) {
            if (prev == null)
                System.out.println("The predecessor doesn't exist for node " + root.val);
            else
                System.out.println("The predecessor of node " + root.val + " is " + prev.val);

            return;
        }
        prev = root;
        traversal(root.right, k);
    }

    public static void main(String[] args) {
        question04 temp = new question04();
        question04.TreeNode root = temp.new TreeNode(15);
        root.left = temp.new TreeNode(10);
        root.left.left = temp.new TreeNode(8);
        root.left.right = temp.new TreeNode(12);
        root.right = temp.new TreeNode(20);
        root.right.left = temp.new TreeNode(16);
        root.right.right = temp.new TreeNode(25);

        temp.traversal(root, 15);
        temp.prev = null;
        temp.traversal(root, 10);
        temp.prev = null;
        temp.traversal(root, 20);
        temp.prev = null;
        temp.traversal(root, 8);
        temp.prev = null;
        temp.traversal(root, 12);
        temp.prev = null;
        temp.traversal(root, 16);
        temp.prev = null;
        temp.traversal(root, 25);
    }
}
