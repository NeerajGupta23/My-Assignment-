public class question05 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;
        if (left != null)
            return left;
        if (right != null)
            return right;
        return null;
    }

    public static void main(String[] args) {
        question05 temp = new question05();
        question05.TreeNode root = temp.new TreeNode(15);
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


        // question05.TreeNode x = root.left.left.left; // 6
        // question05.TreeNode x = root.left; // 10
        // question05.TreeNode y = root.left.right; // 12
        // question05.TreeNode x = root.right; // 20
        // question05.TreeNode y = root.left.left.left; // 6
        // question05.TreeNode x = root.right.left.left; // 18
        // question05.TreeNode y = root.right.left.right; // 22
        question05.TreeNode x = root.right.right; // 30
        question05.TreeNode y = root.right.right; // 30
        question05.TreeNode ans =  temp.lowestCommonAncestor(root, x, y);
        System.out.println(ans.val);
    }
}
