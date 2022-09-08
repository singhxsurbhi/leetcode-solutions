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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> in = new ArrayList<>();
        inOrder(root,in);      
        return in;
    }
    
    public void inOrder(TreeNode root, ArrayList<Integer> in){
        if(root != null){
        inOrder(root.left,in);
        in.add(root.val);
        inOrder(root.right,in);
        }
    }
    
}