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
    static int dia=0;
    static int c(TreeNode root){
        if(root==null) return 0;
        int l=c(root.left);
        int r=c(root.right);
        dia=Math.max(dia,l+r);
        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int ans=c(root);
        ans=dia;
        dia=0;
        return ans;
    }
}
