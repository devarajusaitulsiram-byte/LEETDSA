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
      void in_o(TreeNode root,List<Integer>ans){
        if(root==null) return;
        in_o(root.left,ans);
        ans.add(root.val);
        in_o(root.right,ans);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        in_o(root,ans);
        return ans;
    }
}