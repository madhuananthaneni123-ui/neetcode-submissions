/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    static boolean b=true;
    static int c(TreeNode root){
        if(root==null) return 0;
        int l=c(root.left);
        int r=c(root.right);
        if(Math.abs(l-r)>1){
            b=false;
        }
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        c(root);
        boolean w=b;
        b=true;
        return w;
    }
}
