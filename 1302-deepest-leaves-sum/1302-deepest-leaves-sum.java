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
    public int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        int sum=0;
        if(root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i = 0 ; i < n ; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                level.add(q.poll().val);
            }
            res.add(level);  
        }
        int n = res.size()-1;
        for(int i=0;i< res.get(n).size() ;i++){  
            sum += res.get(n).get(i);
        }
    return sum;
    }
}