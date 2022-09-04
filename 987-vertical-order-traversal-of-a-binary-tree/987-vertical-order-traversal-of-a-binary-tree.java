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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        Map<Integer, Map<Integer,List<Integer>>> store = new TreeMap<>();
        
        solve(store,root,0,0);
        
        for(Integer key : store.keySet()){
            Map<Integer,List<Integer>> map = store.get(key);
            List<Integer> sub = new ArrayList<>();
            for(Integer mK : map.keySet()){
                List<Integer> e = map.get(mK);
                Collections.sort(e);
                sub.addAll(e);
            }
            res.add(sub);
        }
        
        return res;
    }
    
    private void solve(Map<Integer, Map<Integer,List<Integer>>> store, TreeNode root, int level, int hLevel){
        if(root == null) return;
        
        Map<Integer,List<Integer>> map = (store.containsKey(level)) ? store.get(level) : new TreeMap<>();
        
        List<Integer> value = (map.containsKey(hLevel)) ? map.get(hLevel) : new ArrayList<>();

        value.add(root.val);
        map.put(hLevel,value);
        store.put(level,map);
        
       
        solve(store,root.left,level-1,hLevel+1);
        solve(store,root.right,level+1,hLevel+1);
    }
}