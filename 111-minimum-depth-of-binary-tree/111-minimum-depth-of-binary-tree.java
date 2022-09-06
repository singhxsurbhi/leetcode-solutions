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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int min = 1;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode node = q.poll();
                if(node.left == null && node.right == null) return min;
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            min++;
        }
        return min;
    }
}