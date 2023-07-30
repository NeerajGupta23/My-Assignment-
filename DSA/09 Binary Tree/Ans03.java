import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Ans03 {

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

    public static int[] traverseSpiral(TreeNode root) {
        Deque<TreeNode> deq = new LinkedList<>();
        Deque<TreeNode> temp;
        ArrayList<Integer> arr = new ArrayList<>();

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
            Deque<TreeNode> q = new LinkedList<>(temp);
            while (!q.isEmpty()) {
                TreeNode t = q.removeLast();
                if (t != null) {
                    arr.add(t.val);
                }
            }
        }

        int n = arr.size();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = arr.get(n - 1 - i);
        }
        return ar;
    }

    public static void main(String[] args) {
        Ans03 p = new Ans03();
        Ans03.TreeNode root = p.new TreeNode(1);
        root.left = p.new TreeNode(2);
        root.left.left = p.new TreeNode(4);
        root.right = p.new TreeNode(3);
        root.right.right = p.new TreeNode(6);
        root.right.left = p.new TreeNode(5);
        root.right.left.left = p.new TreeNode(7);
        root.right.left.right = p.new TreeNode(8);
        System.out.println(Arrays.toString(traverseSpiral(root)));
        
    }
}