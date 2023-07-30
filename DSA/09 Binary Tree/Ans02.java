public class Ans02 {
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

    static int maxHeight = Integer.MAX_VALUE;

    public static boolean isComplete(TreeNode root, int height) {
        if (root == null) {
            if (maxHeight >= height) {
                maxHeight = height;
                return true;
            } else
                return false;
        }

        return isComplete(root.left, height + 1) && isComplete(root.right, height + 1);
    }

    public static void main(String[] args) {
        Ans02 p = new Ans02();
        Ans02.TreeNode root = p.new TreeNode(1);
        root.left = p.new TreeNode(2);
        root.left.left = p.new TreeNode(4);
        root.left.right = p.new TreeNode(5);
        root.right = p.new TreeNode(3);
        root.right.left = p.new TreeNode(6);
        boolean bool = isComplete(root, 0);
        if (bool)
            System.out.println("Complete Binary Tree");
        else
            System.out.println("Not Complete Binary Tree");

            
        p = new Ans02();
        root = p.new TreeNode(1);
        root.left = p.new TreeNode(2);
        root.left.left = p.new TreeNode(4);
        root.right = p.new TreeNode(3);
        root.right.left = p.new TreeNode(5);
        root.right.right = p.new TreeNode(6);
        bool = isComplete(root, 0);
        if (bool)
            System.out.println("Complete Binary Tree");
        else
            System.out.println("Not Complete Binary Tree");
    }

}
