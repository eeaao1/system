package od.ext.letcode.tree;


import lombok.val;

public class T4 {
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


    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return re(root.left, root.right);
    }

    public boolean re(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            if (left == null && right == null) {
                return true;
            } else {
                return false;
            }
        }
        if (left.val == right.val) {
          return   re(left.left, right.right) &&  re(left.right, right.left);
        } else {
            return false;
        }
    }
}
