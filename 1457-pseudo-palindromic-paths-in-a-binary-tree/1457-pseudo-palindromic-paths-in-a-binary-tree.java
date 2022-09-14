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
    int result = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        compute(root,0);
        return result;
    }
    
    private void compute(TreeNode root,int path){
        if(root == null)return;
        
        path ^= 1<<root.val;
        
        if(root.left == null && root.right == null){
            if(path == 0 || (path&(path-1)) == 0)
                result++;
            return;
        }
        
        compute(root.left,path);
        compute(root.right,path);
    }
}