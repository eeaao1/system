package od.ext.letcode.tree;


import java.util.Set;

public class T8 {
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

    public static class Info {
        boolean isbal;
        Integer min;
        Integer max;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode.left = treeNode1;
        treeNode.right = treeNode4;
        treeNode4.left = treeNode3;
        treeNode4.right = treeNode6;
        isValidBST(treeNode);
    }

    public static boolean isValidBST(TreeNode root) {
        Info dfs = dfs(root);
        return dfs.isbal;
    }

    private static Info dfs(TreeNode root) {
        if (root == null) {
            return null;

        }
        Info info = new Info();
        info.max = root.val;
        info.min = root.val;
        info.isbal = true;
        Info lf = dfs(root.left);
        Info rf = dfs(root.right);
        if (lf != null) {
            info.isbal = info.isbal && lf.isbal && root.val > lf.max;
            info.max = Math.max(lf.max, info.max);
            info.min = Math.min(lf.min, info.min);
        }
        if (rf != null) {
            info.isbal = info.isbal && rf.isbal && root.val < rf.min;
            info.max = Math.max(rf.max, info.max);
            info.min = Math.min(rf.min, info.min);
        }
        return info;
    }

}
