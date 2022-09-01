/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> sort = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            sort.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(sort);
        int i=0;
        temp=head;
        while(i<sort.size()){
            temp.val = sort.get(i);
            temp = temp.next;
            i++;
        }
        return head;
    }
}