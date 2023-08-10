public class question02 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    
    int k;
    public int largestElement(TreeNode root) {
        if(root == null)
            return -1;

        int a = largestElement(root.right);
        if(a != -1)
            return a;

        k--;
        if(k == 0)
            return root.val;

        return largestElement(root.left);
    }
    public static void main(String[] args) {
        question02 temp = new question02();
        question02.TreeNode root = temp.new TreeNode(15);
        root.left = temp.new TreeNode(10);
        root.left.left = temp.new TreeNode(8);
        root.left.right = temp.new TreeNode(12);
        root.right = temp.new TreeNode(20);
        root.right.left = temp.new TreeNode(16);
        root.right.right = temp.new TreeNode(25);

        temp.k = 2;
        System.out.println(temp.largestElement(root));
    }
}
