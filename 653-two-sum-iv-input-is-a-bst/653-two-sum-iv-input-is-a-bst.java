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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();  
        return preorder(root, set, k);      
    }
    public boolean preorder(TreeNode root, Set<Integer> set, int k){
        if(root == null){
            return false; 
        }
        int countElement = k-root.val; 
        if(set.contains(countElement)){ 
            return true;                
        }
        set.add(root.val); 
        return preorder(root.left, set, k) || preorder(root.right, set, k);
    }
}