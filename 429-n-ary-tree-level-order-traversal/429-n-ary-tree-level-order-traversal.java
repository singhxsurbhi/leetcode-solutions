/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return res;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i=0 ; i<n ; i++){
                Node curr = q.poll();
                for(Node val : curr.children){
                    q.offer(val);
                }
                level.add(curr.val);
            }
            res.add(level);
        }
        return res;
    }
}