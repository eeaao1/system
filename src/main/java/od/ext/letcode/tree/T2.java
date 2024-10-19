package od.ext.letcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class T2 {
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




//    public static int maxDepth(TreeNode root) {
//        TreeNode n1 = new TreeNode(3);
//        TreeNode n9 = new TreeNode(9);
//        TreeNode n20 = new TreeNode(20);
//        TreeNode n15 = new TreeNode(15);
//        TreeNode n7 = new TreeNode(7);
//        n1.left = n9;
//        n1.right = n20;
//        n20.left = n15;
//        n20.right = n7;
//
//
//        int i = 1;
//        List<TreeNode> res = new ArrayList<>();
//        List<TreeNode> res2 = new ArrayList<>();
//        res.add(n1.left);
//        res.add(n1.right);
//        while (true) {
//            if (res.isEmpty()) {
//                break;
//            }
//            for (TreeNode node : res) {
//                if (node.left != null) {
//                    res2.add(node.left);
//                }
//                if (node.right != null) {
//                    res2.add(node.right);
//                }
//
//            }
//
//            res.clear();
//            res.addAll(res2);
//            res2.clear();
//            i++;
//        }
//        return i;
//    }
public int maxDepth(TreeNode root) {
    if(root == null){
        return 0;
    }
    return Math.max(dfs(root.left,1),dfs(root.right,1));
}

    public int dfs(TreeNode node,int depth){
        if(node != null){
            depth++;
        } else{
            return depth;
        }
        return Math.max(dfs(node.left,depth),dfs(node.right,depth));
    }
}
