public class question01 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        question01 temp = new question01();
        question01.TreeNode root = temp.new TreeNode(15);
        root.left = temp.new TreeNode(10);
        root.left.left = temp.new TreeNode(8);
        root.left.right = temp.new TreeNode(12);
        root.right = temp.new TreeNode(20);
        root.right.left = temp.new TreeNode(16);
        root.right.right = temp.new TreeNode(25);

       

        // searching in bst
        int target = 25;
        while (root != null) {
            if(target == root.val){
                System.out.println("True");
                break;
            }
            else if(target > root.val)
                root = root.right;
            else 
                root = root.left;
        }
        if(root == null)    
            System.out.println("False");
    }    
}