public class Ans04 {
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


    static int max;
    public static void heightOfTree(TreeNode root, int height) {
        if(root == null) {
            if(max < height)
                max = height;
            return;
        }

        heightOfTree(root.left, height+1);
        heightOfTree(root.right, height+1);
    }

    public static void leftView(TreeNode root, boolean[] check, int height) {
        if(root == null)
            return;


        if(!check[height]) {
            System.out.print(root.val + " ");
            check[height] = true;
        }
        leftView(root.left, check, height+1);
        leftView(root.right, check, height+1);
    }

    public static void main(String[] args) {
        Ans04 p = new Ans04();
        Ans04.TreeNode root = p.new TreeNode(1);
        root.left = p.new TreeNode(2);
        root.right = p.new TreeNode(3);
        root.right.right = p.new TreeNode(6);
        root.right.left = p.new TreeNode(5);
        root.right.left.left = p.new TreeNode(7);
        root.right.left.right = p.new TreeNode(8);
        heightOfTree(root, 0);
        boolean[] check = new boolean[max];
        leftView(root, check, 0);




        System.out.println();
        p = new Ans04();
        root = p.new TreeNode(1);
        root.left = p.new TreeNode(2);
        root.right = p.new TreeNode(3);
        root.left.right = p.new TreeNode(4);
        root.right.left = p.new TreeNode(5);
        heightOfTree(root, 0);
        check = new boolean[max];
        leftView(root, check, 0);
    }
}
