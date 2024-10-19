package od.ext.letcode.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T6 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {
        levelOrder(null);
    }

//    public static int diameterOfBinaryTree(TreeNode root) {
//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//        TreeNode n4 = new TreeNode(4);
//        TreeNode n5 = new TreeNode(5);
//        n1.left = n2;
//        n1.right = n3;
//        n2.left = n4;
//        n2.right = n5;
//        root = n1;
//        if (root == null) {
//            return 0;
//        }
//        int re = 0;
//        re = re(root, 0, 0);
//        return re;
//    }

    static int ans;

    public static List<List<Integer>> levelOrder(TreeNode root) {
        root = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        root.left = n9;
        root.right = n20;
        root.right.left = n15;
        n20.right = n7;
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return res;
        }
        q.add(root);
        depth(q, res);
        return res;
    }

    public static void depth(Queue<TreeNode> q, List<List<Integer>> res) {
        if (q.isEmpty()) {
            return;
        }
        List<Integer> qi = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        while (!q.isEmpty()) {
            TreeNode poll = q.poll();
            qi.add(poll.val);
            if (poll.left != null) {
                qq.add(poll.left);
            }
            if (poll.right != null) {
                qq.add(poll.right);
            }
        }
        res.add(qi);
        depth(qq, res);
    }

}
