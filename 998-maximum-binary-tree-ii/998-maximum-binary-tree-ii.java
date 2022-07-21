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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
         if(val > root.val){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        } else {
            if(root.right != null){
                 root.right = insertIntoMaxTree(root.right, val);
            } else {
                root.right = new TreeNode(val);
            }
            return root;
        }
    }
}