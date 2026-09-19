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
    public TreeNode lowestCommonAncestor(TreeNode r, TreeNode p, TreeNode q) {
        if(r==null || r.val==p.val ||r.val==q.val) return r;
        TreeNode left=lowestCommonAncestor(r.left,p,q);
        TreeNode right=lowestCommonAncestor(r.right,p,q);
        if(left!=null && right!=null) return r;
        if(left==null) return right;
        return left;
    }
}
