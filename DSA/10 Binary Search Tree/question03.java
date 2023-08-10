public class question03 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean binarySearch(TreeNode root, int val, TreeNode root1) {
        if (root == null)
            return false;

        // below condition is important
        if (val == root.val && root != root1)
            return true;

        if (val > root.val)
            return binarySearch(root.right, val, root1);

        return binarySearch(root.left, val, root1);
    }

    public boolean traverseInorder(TreeNode root, int k, TreeNode root1) {
        if (root == null)
            return false;


        boolean check = traverseInorder(root.left, k, root1);
        if (check)
            return true;


        if (binarySearch(root1, k - root.val, root)) {
            System.out.println("(" + root.val + "," + (k-root.val) + ")");
            return true;
        }


        return traverseInorder(root.right, k, root1);
    }

    public static void main(String[] args) {
        question03 temp = new question03();
        question03.TreeNode root = temp.new TreeNode(15);
        root.left = temp.new TreeNode(10);
        root.left.left = temp.new TreeNode(8);
        root.left.right = temp.new TreeNode(12);
        root.left.left.left = temp.new TreeNode(6);
        root.left.left.right = temp.new TreeNode(9);
        root.right = temp.new TreeNode(20);
        root.right.left = temp.new TreeNode(20);
        root.right.left.left = temp.new TreeNode(18);
        root.right.left.right = temp.new TreeNode(22);
        root.right.right = temp.new TreeNode(30);

        System.out.println(temp.traverseInorder(root, 40, root));
    }
}
