import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Ans01 {

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

    public static void traverseSpiral(TreeNode root) {
        Deque<TreeNode> deq = new LinkedList<>();
        Deque<TreeNode> temp;
        ArrayList<Integer> arr = new ArrayList<>();
        boolean even = false;

        deq.add(root);
        arr.add(root.val);
        while (!deq.isEmpty()) {

            // normal code
            temp = new LinkedList<>();
            while (!deq.isEmpty()) {
                TreeNode node = deq.remove();
                if (node != null) {
                    temp.add(node.left);
                    temp.add(node.right);
                }
            }
            deq = temp;

            // important code
            if (even == false) {
                Deque<TreeNode> q = new LinkedList<>(temp);
                even = true;

                while (!q.isEmpty()) {
                    TreeNode t = q.removeLast();
                    if (t != null) {
                        arr.add(t.val);
                    }
                }
            } else {
                Deque<TreeNode> q = new LinkedList<>(temp);
                even = false;
                while (!q.isEmpty()) {
                    TreeNode t = q.removeFirst();
                    if (t != null) {
                        arr.add(t.val);
                    }
                }
            }

        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        Ans01 p = new Ans01();
        Ans01.TreeNode root = p.new TreeNode(1);
        root.left = p.new TreeNode(2);
        root.left.left = p.new TreeNode(4);
        root.right = p.new TreeNode(3);
        root.right.right = p.new TreeNode(6);
        root.right.left = p.new TreeNode(5);
        root.right.left.left = p.new TreeNode(7);
        root.right.left.right = p.new TreeNode(8);
        traverseSpiral(root);
    }
}